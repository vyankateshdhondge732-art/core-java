package inheritanc;

class Test {
	String name;
	int id;

	public Test() {

	}

	public Test(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public void showrecored() {
		System.out.println("name=" + name);
		System.out.println("id=" + id);

	}
}

class Employee extends Test {
	int empid;
	float salary;

	public Employee() {

	}

	public Employee(int empid, float salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public void printrecored() {
		System.out.println("empid=" + empid);
		System.out.println("salary=" + salary);
	}

}

public class sigle {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.showrecored();
		e.printrecored();

	}

}
