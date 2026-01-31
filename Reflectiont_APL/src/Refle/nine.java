package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class nine {

	public static void main(String[] args) throws Exception{
		  
		Class<?>cl= Class.forName("Refle.banu");
		Constructor<?>[]con=cl.getDeclaredConstructors();
		
		Constructor<?>con1=cl.getDeclaredConstructor(String.class);
		   con1.setAccessible(true);
//		
//		Field[] f1=cl.getDeclaredFields();
//		  for(Field f:f1) {
//			  System.out.println(f);
		   
		   banu b =(banu)con1.newInstance("jfhjd"); 
			  Field f2=cl.getDeclaredField("name");
			  f2.setAccessible(true);
			  System.out.println(f2.get(b));
		  }
		
	}


class banu{
	  private String name;
	  private int id;
	   
	  private banu() {
		   
} 
	  private banu(int id ) {
		  
	  } private banu (String name) {
		  this.name=name;
	  }
    
	
}
