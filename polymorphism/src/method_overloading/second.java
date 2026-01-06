package method_overloading;

public class second {

	public static void main(String[] args) {
         Student s1 = new Student();
         System.out.println(s1 .name("i ","love"));
	}

}
class Student {
	public String name (String a ,String b) {
	return a+b;

	}
	public String name  (String a ,String b,String c) {
		return a+b;

	
}
}

