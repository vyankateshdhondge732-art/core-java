package practic;

public class first {

	public static void main(String[] args) {
      int i=10;
    	  int j=0;
    	  try {                                           ///Exceptionn example
    	  System.out.println(i/j);
    	  
	}
    	  catch(Exception ex) {
    		  System.out.println(ex.getMessage());
    	  }
    	  System.out.println(i/j);
	}
}
