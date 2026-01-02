
import java.util.Scanner;
public class calss1 {
	public static void main(String[]args) {
		{
			
		{
		        Scanner scanner = new Scanner(System.in);

		        // Taking employee details as input
		        System.out.print("Enter Employee ID: ");
		        int empId = scanner.nextInt();
		        scanner.nextLine(); // Consume newline

		        System.out.print("Enter Employee Name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter Employee Salary: ");
		        double salary = scanner.nextDouble();

		        // Displaying employee details
		        System.out.println("\n--- Employee Details ---");
		        System.out.println("ID     : " + empId);
		        System.out.println("Name   : " + name);
		        System.out.println("Salary : " + salary);

		        scanner.close();
		    }
		}
	}

}
