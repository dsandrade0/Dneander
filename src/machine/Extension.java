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
		D_AC <<= op;
	}
	
	public void d_shift_rigth(short op){
		D_AC >>= op;
	}
	
	public void d_memory_dump(){
		for (int i=0 ; i < D_MEMORY.length; i++) {
			if (i%6==0 && i != 0){
				System.out.print(" [pos "+i+" - "+D_MEMORY[i] +"]\n");
			} else {
				System.out.print(" [pos "+i+" - "+D_MEMORY[i]+"]");				
			}
		}
	}
	
	public void d_halt(){
		System.exit(0);
	}
	
}
