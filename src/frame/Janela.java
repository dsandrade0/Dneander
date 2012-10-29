package frame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import machine.Instructions;
import machine.Machine;
import machine.UnitInstruction;

import br.gov.se.sefaz.util.ArquivoTexto;


public class Janela extends JFrame{
	JTextField nome;
	File arquivo;
	ArquivoTexto program;
	String linhas;
	Collection colLinhas;
	UnitInstruction control;
	Instructions ir;
	Machine maquina;
	
    public Janela() throws Exception{
        super("Dneander");
    
        nome = new JTextField();
        nome.setColumns(20);
        nome.setEditable(false);
        
        maquina = new Machine();
        control = new UnitInstruction();
		ir = new Instructions();
        
        Container c = getContentPane();
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        c.setLayout(layout);
        c.add(nome);
        startButton(c);
        runButton(c);
        
        setSize(400, 200);
        setVisible(true);
    }
    
   
	private void inicia() {
		int memoriaSize = maquina.D_MEMORY.length;
		
		while (true) {
			if (maquina.D_PC == 127)
				maquina.D_PC = 0;
			
			control.callInstruction(maquina.D_MEMORY[maquina.D_PC]);
		}
		
	}


	private void runButton(Container c) throws Exception{
    	JButton btn = new JButton("Rodar");
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent i){
                	try {
						lerArquivo();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
                }
            }   
        );
    
        c.add(btn);
		
	}


	public static void main(String[] args) throws Exception {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	
	
	 private void startButton(Container c) {
	    	JButton btn = new JButton("Abrir Arquivo");
	        btn.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent i){
	                    JFileChooser fc = new JFileChooser();
	                    int res = fc.showOpenDialog(null);
	                    
	                    if(res == JFileChooser.APPROVE_OPTION){
	                        arquivo = fc.getSelectedFile();  
	                        nome.setText(arquivo.getPath());
	                    }
	                    else
	                        JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo."); 
	                }
	            }   
	        );
	    
	        c.add(btn);
		}
	
	 private void lerArquivo() throws FileNotFoundException, IOException {
	    program = new ArquivoTexto(arquivo.getName());
	    program.abrirParaLeitura();
	    
	    linhas = program.lerLinha();
	    colLinhas = new ArrayList();  
	    
	    while (linhas != null && !linhas.equals("") ) {
	    	colLinhas.add(linhas);
	    	linhas = program.lerLinha();
	    }

	    executa();
	 }


	/**
	 * 
	 */
	private void executa() {
		Iterator iter = colLinhas.iterator();
		String lida;
		String[] split;
		Short operando;
		int memoriaParcial;
		
		while (iter.hasNext()) {
			lida = (String) iter.next();
			split = lida.split(",");
			
			if (split[1]==null || " ".equals(split[1]) || "".equals(split[1]) ) {
				operando = new Short("0");
			} else {
				operando = new Short(split[1].replace(" ", ""));
			}
			memoriaParcial = carregaLinha(split[0], operando);
			alocaMemoria(memoriaParcial);
		}
		
		inicia();
	}
	
	private void alocaMemoria(int memoriaParcial) {
		boolean insere = false;
		for(int i=0; i< 128; i++) {
			if (maquina.D_MEMORY[i] == 0) {
				maquina.D_MEMORY[i] = memoriaParcial;
				insere = true;
				break;
			} 
		}
		
		if (!insere) {
			JOptionPane.showMessageDialog(null, "Memoria Cheia", "ERROR", ERROR);
		}
	}


	private int carregaLinha(String upcode, short operando) {
	
		int linhaMemoria;
		byte instrucao = ir.getCode(upcode);
		linhaMemoria = instrucao<<16;
		linhaMemoria += operando;
		
		return linhaMemoria;
	}
	 
	 
	
}