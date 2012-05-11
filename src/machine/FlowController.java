package machine;

public class FlowController {

	private static FlowController single;
	
	private FlowController(){
		
	}
	
	public static FlowController getInstance(){
		if(single != null)
			return single;
		
		single = new FlowController();
		return single;
	}
	
	


}
