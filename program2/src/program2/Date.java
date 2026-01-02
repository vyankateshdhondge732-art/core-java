package program2;

import java.util.Scanner;

class Mont {
	int day;
	int mont;
	int year;

	void getRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		day=sc.nextInt();
		System.out.println("Enter the mont");
		mont=sc.nextInt();
		System.out.println("Enter the year");
		year=sc.nextInt();
				
		}
			void displayRecord() {
				 System.out.println(day+"/"+mont+"/"+year);
				 }
		 	
		
	}



public class Date {
	public static void main(String[] args) {
	Mont d1=new Mont ();
	Mont d2=new Mont();
	d1.getRecord();
	d1.displayRecord();
    d2.getRecord();
	d2.displayRecord();
	
   
	}

	}


