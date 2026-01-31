package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Fourty {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
               Class<?>cl= Class.forName("Refle.xrp");
               Constructor<?>[]con=cl.getDeclaredConstructors();
               for(Constructor c:con) {
            	   System.out.println(c);
            	   
            	   Constructor<?>con1=cl.getDeclaredConstructor(String.class);
            	     con1.setAccessible(true);
            	     xrp x = (xrp)con1.newInstance();
            	   
            	   Method m =cl.getDeclaredMethod("Shubhhu",String.class);
            	   m.setAccessible(true);
            	   m.invoke(x, "ughjh");
            	   
               }
     
	}

}
class xrp{
	private String name;
	private int id;
	private String namea;
	
	private xrp() {
		
	}
	private xrp(String name) {
		this.name=name;
		
	}private xrp(int id){
		this.id=id;
		  
	}
                 private void Shubhhu(String namea) {
		         this.namea=namea;
		System.out.println("namea="+namea);
	}
}