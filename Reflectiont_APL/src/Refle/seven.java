package Refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class seven {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		 Class<?> cl=Student.class;         // first way   give the reflection 
//		Student s1=new Student();           // second way 
//      Class<?>cs=  s1.getClass();
		Constructor<?>[]con=cl.getDeclaredConstructors();
		 for(Constructor c:con) {
			 System.out.println(c);
			 
			 Constructor<?>con1=cl.getDeclaredConstructor(String.class);
			 con1.setAccessible(true);
			    Student s1=(Student)con1.newInstance("field");
			    
			    Field f1=cl.getDeclaredField("name");
			    f1.setAccessible(true);
			     System.out.println(f1.get(s1));
			     
			     
			     
			     
			     Constructor<?>con2=cl.getDeclaredConstructor(int.class);
				 con2.setAccessible(true);
				    Student s2=(Student)con2.newInstance(8878);
				    
				    Field f2=cl.getDeclaredField("id");
				    f2.setAccessible(true);
				     System.out.println(f2.get(s2));
				     
			    
		 }
	}

}
class Student{
	
	private String name;
	  private int id;
	private  Student(String name) {
		this.name=name;
	}
	private Student(int id){
		this.id=id;
	}
//	private String getname() {
//		return this.name;
//		
//	}
}
