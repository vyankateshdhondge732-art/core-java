package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class five {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		    //      Class<?> cs=Bmw.class;
		     
		  Class <?> cl=Class.forName("Refle.Bmw");
		  
		  Constructor<?>[]con=cl.getDeclaredConstructors();
		   for(Constructor c:con) {
			   System.out.println(c);
		   }
	}

}

class Bmw{
	  
	private int a;
	private String B;
	private String madhu;
	Bmw() {
		
	} 
	private Bmw(int a) {
		
	}
	private Bmw(int B,String madhu) {
		
	}
}
