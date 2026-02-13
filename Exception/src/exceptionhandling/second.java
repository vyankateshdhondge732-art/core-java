package exceptionhandling;

public class second {

	public static void main(String[] args) {
   try {
	   int a=10/0;      // Arthmetic Excetion 
   }
   catch(ArithmeticException e) {
	   System.out.println("error ");
   }
   finally {
	   System.out.println("finally always run");
	   
   }
	}

}
