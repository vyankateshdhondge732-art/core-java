package abc;

import java.util.Scanner; // 

 
public class Object_Employee {
	String name;
	int empid;
	float salary;
	void inputDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name");
		name = sc.nextLine();
		System.out.println("Enter Employee id");
		empid = sc.nextInt();
		System.out.println("Emter Employee");
		salary = sc.nextFloat();
		
	}
	 void displayDetails() {
		 System.out.println("Enter the name:" + name);
		 System.out.println("Enter the empid:" + empid);
		 System.out.println("Enter the salary:"+salary);
 
	 }
	 public static void main(String[]args) {
		 Object_Employee emp = new Object_Employee();
		 Object_Employee emp2 = new Object_Employee();
		 emp.inputDetails();
		 emp.displayDetails();
		 emp2.inputDetails();
		 emp2.displayDetails();
		 }
   
}
