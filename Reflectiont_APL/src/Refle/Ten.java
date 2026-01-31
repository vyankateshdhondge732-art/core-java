package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ten {

	public static void main(String[] args) throws Exception {
     Class<?> cl =Class.forName("Refle.Lop");
     
     Constructor<?> [] con = cl.getDeclaredConstructors();
       for(Constructor c :con) {
    	   System.out.println(c);
    	   
    	  Constructor <?> con1=cl.getDeclaredConstructor(int.class);
    	     con1.setAccessible(true);
    	     Lop l1 =(Lop)con1.newInstance(85784);
    	       
    	     Field f = cl.getDeclaredField("id");
    	     f.setAccessible(true);
    	     f.setInt(l1, 4343);
    	     System.out.println(f.get(l1));
       }
	}

}
class Lop{
	private int id;
	private String name;
	private Lop() {
		
	}
	private Lop(int id) {
		this.id=id;
	}
	private Lop(String name) {
		
	}
}