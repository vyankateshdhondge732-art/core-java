package exceptionhandling;

public class five {

	public static void main(String[] args) {
        System.out.println(news.run());
		
	}
	}
class news{
	  static int  run() {
	  try { 
		  int a =10/0;
		  System.out.println("try");
		 return 8;
	  }
	  catch(Exception e) {
		  System.out.println("catch");
		  return 9;
	  }
	  finally{
		  System.out.println("finalyy");

		//return 87;
	  }
		  
	  }
}
