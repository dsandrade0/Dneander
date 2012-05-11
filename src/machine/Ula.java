package machine;


public class Ula {

	private static Ula single;
	
	private Ula(){
		
	}
	
	public static Ula getInstance(){
		if(single != null)
			return single;
		
		single = new Ula();
		return single;
	}
	
	
	public void nop() {
		System.out.println("Teste");
	}

	public void d_add(short op) {
		
	}
	
	public void d_subtraction(short op) {
		
	}

	public void d_or(short op) {
		
	}
	
	public void d_exclusive_or(short op) {
		
	}

	public void d_and(short op) {
		
	}

	public void d_not() {
		
	}
	
}
