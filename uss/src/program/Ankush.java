package program;

class lata {
	private int number;
	private int roll;
	private static  int phonnumber;
	
	
	lata( int number,int roll,int phonnumber){
		this.number = number;
		this.roll= roll;
	
	}
	
	static {
		phonnumber=980;
			
		

		
	}	
		public void gateRecored() {
			System.out.println("number="+number);
			System.out.println("roll="+roll);		
			System.out.println("phonnumber="+phonnumber);
			System.out.println();
			
		}
	}
	


public class Ankush {
	public static void main(String[]args) {
		
		
		lata l1 =new lata(109,99,9730585);
		l1 .gateRecored();
		lata l2=new lata(998,265,56509);
		l2.gateRecored();
		
		
		
	}

}
