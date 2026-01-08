package practic;

public class singlton {
 
	public static singlton p1;
	static {
		p1 = new singlton();
		System.out.println("vanky");       // singlton static method // block
	}                                    // we have creat multiple object of this give class but i can have only one static 
	                                    //  block can print 
	
	public static singlton intin() {
		return p1;
		
	}
	public static void main(String[] args) {

		    singlton p1 =singlton .intin();
		    singlton p2=singlton .intin();
		    singlton p3 =singlton .intin();
		    singlton p4=singlton .intin();

	}

}
