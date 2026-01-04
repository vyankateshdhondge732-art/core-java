package practic2;

public class second {

   	public static void main(String[] args) {
//    B b1 = new B();
 //   b1.printB();
    
   // A a1 = new A();
   // a1 .printA();
    
    C c1 = new C();
    c1 .printC();
    c1.printA();
    c1.printB();
	}

}
class A {
	void printA() {
		System.out.println("running"); 
		
	}
}
class B extends A{
	void printB() {
     System.out.println("heloo")		;
	}
}
class C extends B{
	    
	     void printC() {
	    	 System.out.println("hash");
	    	 
	     }
}
