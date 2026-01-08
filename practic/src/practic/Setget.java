package practic;

//import program3.Employee1;

class Employee1 {
	private int empid;
	private String name;
	private float salary;

	public void setsalary(float salary) {
		this.salary = salary;
	}
//	 public float getsalary() {
	// return salary;
//		}

	Employee1(int empid, String name, float salary) {
		empid = empid;
		name = name;
		salary = salary;

	}

	public void displayRecord() {
		System.out.println("empid =" + empid);
		System.out.println("name =" + name);
		System.out.println("salary =" + salary);

	}

}

public class Setget {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1234, "Amar", 23456);
		e1.setsalary(34567f);
		// e1.getsalary();
		e1.displayRecord();

	}

}

