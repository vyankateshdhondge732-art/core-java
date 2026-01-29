package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class first {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		  
		Class<?> cl= Class.forName("Refle.nanda");
		   
		Constructor<?>[]con=cl.getDeclaredConstructors();
	  for(Constructor<?> c:con) {
			System.out.println(c);
		}
	    
	    Constructor<?> c1=cl.getDeclaredConstructor(int.class);
	    c1.setAccessible(true);
	    nanda n1=(nanda)c1.newInstance(7488);
		
		System.out.println(n1.id);
        
	}

} 
class nanda{
	String sam;
	int id;
	int mad;
	private nanda() {
		
	}
	private nanda(int id) {
	this.id=id;
	
}
	private nanda(String name,int mad) {
		this.sam=sam;
		this.mad=mad;
		
	}
}

