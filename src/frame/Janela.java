package frame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Janela extends JFrame{
    public Janela(){
        super("Dneander");
    
        Container c = getContentPane();
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        c.setLayout(layout);
        startButton(c);
        
        
        setSize(400, 200);
        setVisible(true);
    }
    
   
	public static void main(String[] args) {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	
	
	 private void startButton(Container c) {
	    	JButton btn = new JButton("Abrir Arquivo");
	        btn.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                    JFileChooser fc = new JFileChooser();
	                    int res = fc.showOpenDialog(null);
	                    
	                    if(res == JFileChooser.APPROVE_OPTION){
	                        File arquivo = fc.getSelectedFile();  
	                        JOptionPane.showMessageDialog(null, "Voce escolheu o arquivo: " + arquivo.getName());
	                    }
	                    else
	                        JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo."); 
	                }
	            }   
	        );
	    
	        c.add(btn);
		}

	
}