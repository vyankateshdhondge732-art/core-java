package program;


class priya {
	int bank;
	int accno;
	private static int ifcod;
	
	priya(){
		
	//this.bank=bank;
	//this.accno=accno;
		 bank=1234;
		 accno=12344;
		
	}
	
	public void gatedisply(){
		System.out.println("bank:"+bank);
		System.out.println("accno:"+accno);
		System.out.println("ifcod:"+ifcod);
		System.out.println();
	}
	static {
		ifcod=2000;
			
			
		}
}
	

public class Anuska {
	public static void main(String[]args) {
		priya p1 =new priya();
		priya p2 = new priya();
		p1.gatedisply();
		p2.gatedisply();
	}
	
	}
	


