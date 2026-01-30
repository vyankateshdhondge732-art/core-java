package Refle;

import java.lang.reflect.Field;

public class five {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		    //      Class<?> cs=Bmw.class;
		     
		  Class <?> cl=Class.forName("Refle.Bmw  ");
		
		  Field[]  Fields = cl.getDeclaredFields();
		  
		  for(Field f:Fields) {
			  System.out.println(Fields);
			  
		  }
	}

}

class Bmw{
	  
	private int a;
	private String B;
	private String madhu;
	Bmw() {
		
	} 
	private Bmw(int a) {
		
	}
	private Bmw(int B,String madhu) {
		
	}
}
