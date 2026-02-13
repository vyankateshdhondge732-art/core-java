package exceptionhandling;

public class third {
          
	static int test() {
		try {
			return 9;
		}
		finally {
			System.out.println("finnaly run");
			
		}
	}
	
	
	public static void main(String[] args) {
        System.out.println(test());
	}

}
