package program2;

class come{
	private int number;
	private static int roll;
	
	
	come(int number, int roll){
	this.number=number;
		
	}

	static {
	roll= 908;
	
	}
	
	public void gateRecored(){
		System.out.println("number="+number);
		System.out.println("roll="+roll);
		
	}
	}

public class Sami {
	public static void main(String[]args) {
		come c1 = new come(767,879);
		c1.gateRecored();
		
		
		
	}

}
