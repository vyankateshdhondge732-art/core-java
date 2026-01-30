package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Third {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		 Class<?>cl=Class .forName("Refle.Sam");
		//System.out.println(Sam.class);
		
		Constructor<?>[]con=cl.getDeclaredConstructors();
		   for(Constructor c: con) {
			   System.out.println(c);
		   }
        
        Constructor<?> co1=cl.getDeclaredConstructor(int.class);
              co1.setAccessible(true);
              Sam s1 =(Sam)co1.newInstance(3893);
              System.out.println(s1.A);
              
              
              System.out.println("--------------------");
              
              
              Constructor<?> co2= cl.getDeclaredConstructor(int.class,String.class);
              co2.setAccessible(true);
              Sam s2 =(Sam)co2.newInstance(84839,"king");
              System.out.println(s2.B);
              System.out.println(s2.Sundari);
              
	}
		}


class Sam{
	int A;
	int B;
	String Sundari;
	private Sam() {
		
	}
	private Sam(int A) {
		this.A=A;
		
	}
	private Sam(int B,String Sundari) {
		this.B=B;
		this.Sundari=Sundari;
		
	}
}
