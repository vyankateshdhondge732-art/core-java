package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Thirty {

	public static void main(String[] args) throws Exception {
          Class <?>cl=  Class.forName("Refle.btc");
             Constructor<?>[]con=cl.getDeclaredConstructors();
             for (Constructor c:con) {
            	 System.out.println(c);
            	 
            	 Constructor <?> con1=cl.getDeclaredConstructor(int.class);
            	      con1.setAccessible(true);
            	      
            	      btc b1 =(btc)con1.newInstance(3343);
            	      Field[] f3 =cl.getDeclaredFields();
            	      for (Field f:f3) {
            	    	  System.out.println(f);
            	    	  
            	    	  Field f4 =cl.getDeclaredField("price");
            	    	  f4.setAccessible(true);
            	    	  f4.set(b1, 84783);
            	    	  System.out.println(f4.get(b1));
            	    	  
            	    	  Field f5=cl.getDeclaredField("name");
            	    	  f5.setAccessible(true);
            	    	  f5.set(b1, "king");
            	    	  System.out.println(f5.get(b1));
            	      }
             }
	}

}  
class btc{
	
	private String name;
	private int price;
	
	private btc() {
		
	}
	private btc(int price){
		this.price=price;
	}
	private btc (String name) {
		this.name=name;
		
	}

		
}
