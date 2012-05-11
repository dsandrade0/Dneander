package machine;

import machine.Ula;


public class UnitInstruction {

	public void callInstruction(Byte upcode, short op){
		switch(upcode){
			case 0x00 : new Ula().nop();
			case 0x01 : new DataMovie().d_load(op) ;
			case 0x02 : new DataMovie().d_store(op);
			case 0x03 : new Ula().d_add(op);
			case 0x04 : new FlowController().d_or(op);
			case 0x05 : new FlowController().d_and(op);
			case 0x06 : new Ula().d_not();
			case 0x07 : new Extension().d_jump(op);
			case 0x08 : new Extension().d_jump_on_zero();
			case 0x09 : new Extension().d_jump_on_negative();
			case 0x0A : new Ula().d_subtraction(op);
			case 0x0B : new Ula().d_exclusive_or(op);
			case 0x0C : new Extension().d_shift_left(op);
			case 0x0D : new Extension().d_shift_rigth(op);
			case 0x0E : new Extension().d_memory_dump();
			case 0x0F : new Extension().d_halt();
			
			
		}
		
	}
	
}
