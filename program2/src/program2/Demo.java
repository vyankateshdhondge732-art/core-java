package program2;

import java.util.Scanner;

class Demo1{
	int name;
	int id ;
	int  salary;
		void getrecord(){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the x");
			name = sc.nextInt();
			System.out.println("enter the id");
			id = sc.nextInt();
			System.out.println("enter the salary");
			salary = sc.nextInt();
		}
		
		void display() {
			
		System.out.println(name+" /" +id+ "/" +salary);
	    
		}
}

public class Demo {
	public static void main(String[]args) {
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		d1.getrecord();
		d1.display();
		d2.getrecord();
		d2.display();
		
	} 
	
	

}
