package machine;

public class Extension {
	
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
		
	}
	
	public void d_jump_on_zero(){
			
	}
	
	public void d_jump_on_negative(){
		
	}
	
	public void d_shift_left(short op){
		
	}
	
	public void d_shift_rigth(short op){
		
	}
	
	public void d_memory_dump(){
		
	}
	
	public void d_halt(){
		
	}
	
}
