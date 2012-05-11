package machine;

import machine.Ula;


public class UnitInstruction {

	public void callInstruction(Byte upcode, short op){
		switch(upcode){
			case 0x00 : Ula.getInstance().nop();
			case 0x01 : DataMovie.getInstance().d_load(op) ;
			case 0x02 : DataMovie.getInstance().d_store(op);
			case 0x03 : Ula.getInstance().d_add(op);
			case 0x04 : Ula.getInstance().d_or(op);
			case 0x05 : Ula.getInstance().d_and(op);
			case 0x06 : Ula.getInstance().d_not();
			case 0x07 : Extension.getInstance().d_jump(op);
			case 0x08 : Extension.getInstance().d_jump_on_zero();
			case 0x09 : Extension.getInstance().d_jump_on_negative();
			case 0x0A : Ula.getInstance().d_subtraction(op);
			case 0x0B : Ula.getInstance().d_exclusive_or(op);
			case 0x0C : Extension.getInstance().d_shift_left(op);
			case 0x0D : Extension.getInstance().d_shift_rigth(op);
			case 0x0E : Extension.getInstance().d_memory_dump();
			case 0x0F : Extension.getInstance().d_halt();
			
			
		}
		
	}
	
}
