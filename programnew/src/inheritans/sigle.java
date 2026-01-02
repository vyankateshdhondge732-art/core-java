-package inheritans;

class person{
	private String name;
	private int age;

	public person() {
		this.name="akash";
		this.age=33;
	}
	public person (String name,int age) {
		this.name=name;
		this.age=age;	
	}
	public void showrecored() {
	
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
class Employee extends person{
	private float salary;
	private int empid;
	
	public Employee() {	
		
	}
	public Employee(float salary,int empid) {
		this.salary=4334f;
		this.empid=34;
	}
	public void printrecored() {
		super.showrecored();
		System.out.println("salary="+salary);
		System.out.println("empid="+empid);
	}

}
	public class sigle {
	
	public static void main(String[] args) {
		Employee e1=new Employee(436788,37);
		//e1.showrecored();
		e1.printrecored();

	}

}

	
	
	//Vyanky@202 hiih ghby 
