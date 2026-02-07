package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class new_1 {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
      Class  <?> cl=Class.forName("Refle.nano");
           Constructor<?>[]con=cl.getDeclaredConstructors();
           for(Constructor c :con) {
        	 System.out.println(c);
           }
           Constructor<?>con1=cl.getDeclaredConstructor(String.class);
           con1.setAccessible(true);
           
           nano n=(nano)con1.newInstance("fjj");
           Field[] f3 =cl.getDeclaredFields();
           
          Field f5=cl.getDeclaredField("name");
          f5.setAccessible(true);
          f5.set(n,"mahakal");
          System.out.println(f5.get(n));
          
          Field f6 =cl.getDeclaredField("id");
          f6.setAccessible(true);
          f6.set(n, 4943);
          System.out.println(f6.get(n));
         }
       

}
class nano{
	private String name;
	private int id;
	
  public nano(String name) {
	  this.name=name;
	  
  }
  public nano (int id ) {
	  this.id=id;
  }
}