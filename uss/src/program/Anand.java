package program;

import java.util.Scanner;

class Suresh {
	String name;
	int number;
	float salary;

    public Suresh() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the name");
		name = s1.nextLine();

		System.out.println("Enter the number");
		number = s1.nextInt();

		System.out.println("enter salary");
		salary = s1.nextFloat();
	}
		void gateRecored() {
		//	System.out.println("name"+"/"+number+"/"+salary);
			System.out.println("name="+name);
			System.out.println("number="+number);
			System.out.println("salary="+salary);
		}

	}



public class Anand {
	public static void main(String[] args) {
		Suresh s1 = new Suresh();
        s1 .gateRecored();
        
	}
}
