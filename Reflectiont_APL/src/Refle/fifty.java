package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class fifty {

	public static void main(String[] args) throws Exception {
     Class<?>cl=Class.forName("Refle.Model_1");
     
      
      Constructor<?>[]con=cl.getDeclaredConstructors();
        for(Constructor c:con) {
        	System.out.println(c);
        }
       
        	  Field[] s =cl.getDeclaredFields();
        	 for(Field f:s) {
        		 System.out.println(f);
        	 }	  
        	 Constructor<?>con1=cl.getDeclaredConstructor(String.class);
        	     con1.setAccessible(true);
        	     Model_1 m=(Model_1)con1.newInstance("dbndm");
        	 
        		Field s1 =cl.getDeclaredField("name");
        		 s1.setAccessible(true);
        		 s1.set(m, "dfsbnkd");
        		 System.out.println(s1.get(m));
        	 
        	
        
      
        
      
      
      
	}

}
class Model_1{
	private String name;
	private int id;
	
	private Model_1(){
		
	}
	private Model_1(String name) {
		this.name=name;
	}
	private Model_1(int id) {
		this.id=id;
	}
}

