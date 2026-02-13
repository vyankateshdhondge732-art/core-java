package exceptionhandling;

public class four {
	  static int run() {
   	   try {
   		   return 40;
   	   }
   	   finally {
   		   return 70;
   	   }
      }

	public static void main(String[] args) {
      System.out.println(run());
       }
	}


