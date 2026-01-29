package Optinal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class second {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

	Class<?> cl=Class.forName("Optinal.Stude");
		 
	  Constructor<?> []con=cl.getDeclaredConstructors();
		
		for(Constructor c:con) {
			System.out.println(c);
			
		}
		Constructor<?> c2=cl.getDeclaredConstructor(int .class);
		c2.setAccessible(true);
		Stude s1=(Stude)c2.newInstance(7464838);
		System.out.println(s1.i);
		
		Constructor<?>c3=cl.getDeclaredConstructor(int.class,String.class);
		  c3.setAccessible(true);
		  Stude s2=(Stude)c3.newInstance(874,"king");
		  System.out.println(s2.a);
		  System.out.println(s2.name);
		
   	}
	

}
class Stude{
	 int i;
	String name;
	int a;
	private Stude() {
		
	}
	private Stude(int i) {
		this.i=i;
	}
	private Stude(int a,String name) {
		this.a=a;
		this.name=name;
	}
}
