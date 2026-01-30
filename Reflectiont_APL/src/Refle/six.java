package Refle;

import java.lang.reflect.Constructor;

//import java.lang.reflect.Constructor;

public class six {

	public static void main(String[] args) throws ClassNotFoundException {
		
	       Class<?> cl	=Class.forName("Refle.Rana");
	       
	       Constructor<?>[]con=cl.getDeclaredConstructors();
	       for(Constructor c:con) {
	    	   System.out.println(c);
	       }
		    			}

} class Rana {
	
	public Rana() {
		
	}
	public Rana(int A) {
		
	} public Rana(int G,String H) {
		
	}
	
}
