package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collector;

public class contr {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		  
	Class<?>cl=Class.forName("Refle.BMW");
	
	   Constructor<?>[]con=cl.getDeclaredConstructors();
	   
	         for(Constructor c:con) {
	        	 System.out.println(c);
	         }
	         Constructor<?>con1=cl.getDeclaredConstructor(String.class);
	         con1.setAccessible(true);
	        	    
	        	 System.out.println("++++++++++++++++++++");
	        	 Field[] fields=cl.getDeclaredFields();
	        	 for(Field f:fields) {
	        		 System.out.println(f);
	        		 f.setAccessible(true);
	        		 
	        		 BMW b1=(BMW)con1.newInstance("print re");
	        		 
	       		Field f1=cl.getDeclaredField("name");
	        	 
	        	     f1.setAccessible(true);
	        	     System.out.println(f1.get(b1));
	        	     
	        	 
      		     Field f2 =cl.getDeclaredField("id");
	        	   //  f2.setAccessible(true);
      		     f2.setInt(b1, 4567890);
                      System.out.println(f2.get(b1));	        	     
	        	         }
           
	}

} class BMW{
	  private String name;
	  public int id;
	private BMW(String name) {
		this.name=name;
	} 
	private BMW(int D) {
		
		
	} 
	private BMW (String H,int d) {
		
	}
	
}

	