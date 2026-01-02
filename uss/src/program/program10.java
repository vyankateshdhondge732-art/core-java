package program;

class test {

	private static int num1;            // instans variabl

	private test() {                      // constructor
		System.out.println("shubhu");
	}

	static test hana() {                    // static method
	    return new test();
		
        // 	test t1 = new test();
	     //   return t1;

	}
}

public class program10 {
	public static void main(String[] args) {
		test.hana();

	}

}
