package machine;

public class DataMovie {
	
	private static DataMovie single; 
	
	private DataMovie(){
		
	}
	
	public static DataMovie getInstance(){
		if(single == null)
			return single;
		
		single = new DataMovie(); 
		return single;
	}
	
	public void d_load(short op){
		
	}
	
	public void d_store(short op){
		
	}
	
}
