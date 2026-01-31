package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class eigth {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
            Class<?>cl=Class.forName("Refle.gold");
		   Constructor<?>[]con=cl.getDeclaredConstructors();
		 for(Constructor c:con) {
			 System.out.println(c);
		 }
			 Field[] f2 = cl.getDeclaredFields();
		     for(Field f :f2) {
		    	 System.out.println(f);
		     }
			 Constructor<?>con3=cl.getDeclaredConstructor(int.class);
			  con3.setAccessible(true);
			  gold g=(gold)con3.newInstance(42333);
			  
			  System.out.println(g);
			 
			 
			    	 Field f3=cl.getDeclaredField("D");
			    	 f3.setAccessible(true);
			    	 f3.setInt(g, 4567890);
			    System.out.println(f3.getInt(g));
			     }
		 }	
	

class gold{
	     
	private String name="dfghjk";
	private int D=4567;
	private int E;
	private gold(){
		
	}
	private gold(int D){
		this.D=D;
		
	}
	private gold(int E ,String name){
		
	}
	public String toString() {
		return "gold [name=" + name + ", D=" + D + ", E=" + E + "]";
	}
	
	
	
}

