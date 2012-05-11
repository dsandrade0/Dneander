package machine;

import machine.Ula;

public class UnitInstruction {

	public void callInstruction(Byte upcode, short op) {
		switch (upcode) {
		case 0x00:
			Ula.getInstance().nop();
			break;
		case 0x01:
			DataMovie.getInstance().d_load(op);
			break;
		case 0x02:
			DataMovie.getInstance().d_store(op);
			break;
		case 0x03:
			Ula.getInstance().d_add(op);
			break;
		case 0x04:
			Ula.getInstance().d_or(op);
			break;
		case 0x05:
			Ula.getInstance().d_and(op);
			break;
		case 0x06:
			Ula.getInstance().d_not();
			break;
		case 0x07:
			Extension.getInstance().d_jump(op);
			break;
		case 0x08:
			Extension.getInstance().d_jump_on_zero(op);
			break;
		case 0x09:
			Extension.getInstance().d_jump_on_negative(op);
			break;
		case 0x0A:
			Ula.getInstance().d_subtraction(op);
			break;
		case 0x0B:
			Ula.getInstance().d_exclusive_or(op);
			break;
		case 0x0C:
			Extension.getInstance().d_shift_left(op);
			break;
		case 0x0D:
			Extension.getInstance().d_shift_rigth(op);
			break;
		case 0x0E:
			Extension.getInstance().d_memory_dump();
			break;
		case 0x0F:
			Extension.getInstance().d_halt();
			break;
		default:
			System.out.println("Nao existe");

		}

	}

}
