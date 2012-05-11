package machine;

import machine.Machine;

public class DataMovie extends Machine{
	
	private static DataMovie single; 
	
	private DataMovie(){
		
	}
	
	public static DataMovie getInstance(){
		if(single != null)
			return single;
		
		single = new DataMovie(); 
		return single;
	}
	
	public void d_load(short op){
		D_AC = op;
	}
	
	public void d_store(short op){
		D_MEMORY[op] = D_AC;
	}
	
}
