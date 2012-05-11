package machine;

public class Extension extends Machine {
	
	static Extension single;
	
	private Extension(){
		
	}
	
	public static Extension getInstance(){
		if(single != null)
			return single;
		single = new Extension();
		return single;
	}
	

	public void d_jump(short op){
		D_PC = (byte) op;
	}
	
	public void d_jump_on_zero(short op){
		if(D_ST == 0)
			D_PC = (byte) op;
	}
	
	public void d_jump_on_negative(short op){
		if(D_ST < 0)
			D_PC = (byte) op;
	}
	
	public void d_shift_left(short op){
		
	}
	
	public void d_shift_rigth(short op){
		
	}
	
	public void d_memory_dump(){
		
	}
	
	public void d_halt(){
		System.exit(0);
	}
	
}
