package inheritanc;
class A{
	private String name;
	private float salary;
	private int empid;
	
 public A() {
	 
}
 public A(String name,float salary,int empid) {
	
	 this.name=name;
	 this.salary=salary;
	 this .empid =empid;
 }
@Override
public String toString() {
	return "A [salary=" + salary + ", empid=" + empid + "]";             ///// to string method ////////
}
public void displayRecord() {
	System.out.println("Name"+name);
	System.out.println("salary"+salary);
	System.out.println("empid"+empid);
}
	 
 }
 
public class inhirit {

	public static void main(String[] args) {
	A a=new A("Amar",1200.5f,1);	
	String str=a.toString();
	System.out.println(str);

	}

}
