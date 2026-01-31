package Refle;

import java.lang.reflect.Constructor;

public class Eleone {

	public static void main(String[] args) throws ClassNotFoundException {
    Class<?>cl=Class.forName("Refle.model");
         Constructor<?>[] con=cl.getDeclaredConstructors();
         for(Constructor c :con) {
        	 System.out.println(c  );
         }
	}

} 
class model{
	
	 private String name;
	 private int mark;
	 
	 private model() {
		 
	 }
	 private model(int mark) {
		 
	 }
}
