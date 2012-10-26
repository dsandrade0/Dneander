package teste;

import machine.Instructions;
import machine.Machine;
import machine.UnitInstruction;

public class Teste extends Machine{

	public static void main( String []args){
		UnitInstruction control = new UnitInstruction();
		Instructions ir = new Instructions();
		short c;
		int linha;
		byte teste = ir.getCode("loa");
		linha = teste<<16;
		c = 8;
		linha += c;
		control.callInstruction(linha);
		
		teste = ir.getCode("not");
		linha = teste<<16;
		control.callInstruction(linha);
		
		teste = ir.getCode("sto");
		linha = teste<<16;
		c = 20;
		linha +=c;
		control.callInstruction(linha);

		teste = ir.getCode("dum");
		linha = teste<<16;
		control.callInstruction(linha);
	}
	
}
