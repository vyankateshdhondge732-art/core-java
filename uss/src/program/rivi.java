package program;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class rivi {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Class <?>cl= Class.forName("program.first_1");
	       Constructor<?>[]con=cl.getDeclaredConstructors();
	        for(Constructor<?> c:con) {
	        	System.out.println(con);{
	        	}
	        	Constructor <?>con1=cl.getDeclaredConstructor(int.class);
	        	con1.setAccessible(true);
	        	
	        	first_1 f =(first_1)con1.newInstance(9787);
	        	
	        	   System.out.println(f.a);
	        	 //  System.out.println(f.name);
		        	Constructor <?>con2=cl.getDeclaredConstructor(String.class);
                           con2.setAccessible(true);
                           first_1 f2 =(first_1)con2.newInstance("king");
                           System.out.println(f2.name);
	        	 
	        }
	    		   
       System.out.println(first_1.class);
	}

} class first_1 {
String name;
	int a;
	
	public   first_1(int a) {
		this.a=a;
	}
	public  first_1(String name) {
		this.name=name;
	}
}
