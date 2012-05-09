package machine;

import java.util.Hashtable;
import java.util.Map;

public class Instructions extends AInstructions{

	public Map <Byte, String> op = new Hashtable<Byte, String>();
	
	public void iniciaOperacoes(){
		
		op.put( (byte) 0x00, "nop");
	}

	
	public void nop() {
				
	}


	public void d_load(short op) {
		
	}

	
	public void d_store(short op) {
		
	}

	public void d_add(short op) {
		
	}

	public void d_or(short op) {
		
	}

	public void d_and(short op) {
		
	}

	public void d_not() {
		
	}

	public void d_jump(short op) {
		
	}

	public void d_jump_on_zero(short op) {
		
	}

	public void d_jump_on_negative(short op) {
		
	}

	public void d_subtraction(short op) {
		
	}

	public void d_exclusive_or(short op) {
		
	}

	public void d_shift_left(short op) {
		
	}

	public void d_shift_right(short op) {
		
	}

	public void d_memory_dump() {
		
	}

	public void d_halt() {
		
	}
	
}
