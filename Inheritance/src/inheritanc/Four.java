package inheritanc;

public class Four {

	public static void main(String[] args) {
       maonky m1 =new maonky();
       m1.printA();
   //    m1.printB();
       m1.printC();

	}
}

class Cat {
	void printA() {
		System.out.println("hshb");
		                                     //hiarichical inhiritans//
	}
}
class Dog extends Cat{
	void printB() {
		System.out.println("hswhb");

	}
}
class maonky extends Cat{
	void printC() {
		System.out.println("whshb");

	}
}