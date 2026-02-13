package exceptionhandling;

public class first {

	public static void main(String[] args) {
       try {
    	   int a=50/0;                   // Arthmetic exception
    	 System.out.println("try block");
       }
       
       
       catch(Exception e) {
    	   System.out.println("cathc block");
       }
       
       
       finally {
    	   System.out.println("finnaly block");
       }
	}

}


// out put   try block and finnaly block