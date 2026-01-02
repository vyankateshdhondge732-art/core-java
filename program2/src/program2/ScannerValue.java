
package program2;

import java.util.Scanner;

public class ScannerValue {
	public static void main(String[]args) {
		
	
	String name;
	int Id ;
	float salary;
	 
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name");
	name= sc.nextLine();
	System.out.println("Enetr the id");
	Id = sc.nextInt();
     System.out.println(" enetr the salary");
	salary = sc.nextFloat();
	
	System.out.println("name="+name);
	System.out.println("Id ="+Id);            //line by line output
	System.out.println("salary ="+salary);
	
	}
	
	}
	
	
	
	


