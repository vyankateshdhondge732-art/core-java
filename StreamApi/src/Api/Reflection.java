package Api;

import java.lang.reflect.Constructor;

public class Reflection {

	

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.print(Student.class);
           Class<?>cl= Class.forName(" Api.Student");
               Constructor<?>[] con= cl.getDeclaredConstructors();
               for(Constructor c:con) {
            	   System.out.println(c);
               }
       	}

}
class Student{
	   
	public Student() {
		
	}
	public Student(int i) {
		
	}
	public Student(int a,String name) {
		
	}
}
