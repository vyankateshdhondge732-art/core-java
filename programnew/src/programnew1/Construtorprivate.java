package programnew1;

class hena{
	
	private  hena(){
		System.out.println("king");
		
	}
	
	                                              //   this is the private constrtor
	public static hena instans(){
		hena h1 =new hena();
		return h1;
	
	}
}

public class Construtorprivate {
	
	public static void main(String args []) {
	 
		hena.instans();
		
	}

}
