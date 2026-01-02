package program2;

import java.util.Scanner;

class hero{
	int Rollnumber;
	String name;
	Float marks;
	
	void acceptDisplay() {
	//	int Rollnumber = 11;
	//	String name = "rohit";
	//	float marks = 78;
	  	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rollnumber");
		Rollnumber=sc.nextInt();
		System.out.println("enter the name");
		name =sc.nextLine();
		System.out.println("enetr the marks");
		marks= sc.nextFloat();
		
		
		}
		
		void displayRecord() {
			System.out.println("Enter the Rollnumber"+Rollnumber);
			System.out.println("Enter the name"+name);
			System.out.println("Enter the mark"+marks);
			
			
		}
	
	//	constrcter(){
			
		}
		


public class student {
	public static void main(String[]args) {
		
		hero d1 = new hero();
		hero d2 = new hero();
		d1.acceptDisplay();
		d1.displayRecord();
		d2.acceptDisplay();
		d2.displayRecord();
		
	}
}
			
																																						
	


