package program2;

import java.util.Scanner;

class Vanky {                     // this is class
	int day;
	int month;
	int year;
	
	void getRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		day= sc.nextInt();
		System.out.println("enter the month");
		month = sc.nextInt();
		System.out.println("enter the year");
		year =sc.nextInt();
		
		
	}
	void display() {
		System.out.println(day + " /" +month+  " / " +year);
	}
	
}


public class Madhura {
  public static void main(String[]args)
{  
	 
	   Vanky d1 =new Vanky();       // this is the object
	   d1.getRecord();
	   d1.display();
	   Vanky d2 =new Vanky();
	   d2.getRecord();
	   d2.display();
	   
   }
   
}
