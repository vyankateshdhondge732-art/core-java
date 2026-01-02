package abaraction;

class Akash {
	public void f1() {
		System.out.println("inside b");
	}

	public void f2() {
		System.out.println("inside c");
	}
}

class Banu extends Akash {
	public void f1() {                         /// method overridding//
		System.out.print("inside d");
	}

	public void f4() {
		System.out.println("Inside s");
		System.out.print("inside e");
	}

}

public class simpl {

	public static void main(String[] args) {
	Akash a1 = new Banu();    // upcasting 
	Banu b1=(Banu)a1;         // downcasting
	
            b1.f1();
           
            
            }

}
