package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class second {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> cl=  Class.forName(" Refle.car");
		Field[]  field= cl.getDeclaredFields();
					for(Field f:field) {
						System.out.println(f);
					}
			
		   }
		
	}


class car{
	 private int b;
	private int a;
	private String name;
	
	 private car() {
		 
	 }
	 private car(int a) {
	 this.a=a;
		 
}
	 private car(int b,String name) {
		 this.b=b;
		 this.name=name;
		 
	 }

}
