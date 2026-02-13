package CheckedException;

public class throwkey {

	public static void main(String[] args) {
		  try {
		    	int a= 90/0;
		     System.out.println("try throw");
		     
		     throw new Exception("kypn liha ");
		     
		    }
		    catch(Exception ex) {
		        System.out.println("using throw keywrd");
		    }

	}

}
