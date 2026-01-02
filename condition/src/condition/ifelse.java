package condition;

import java.util.Scanner;

public class ifelse {
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the value");
		int week = sc.nextInt();
		
		switch(week) {
		case 1: System.out.println("monday");
		       break;
		case 2:
			   System.out.println("turday");
		       break;
		case 3:
			   System.out.println("sat");
			   break;
		case 4:
			 System.out.println("friday");
			 
			 default:
				 System.out.println("invalid ");
			
		
		}
 
	}
	
	public static void main3(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the value");
		int a =sc.nextInt();
		int b = sc .nextInt();
		if(a==b) {
			System.out.println("Equal");
		}else {
			System.out.print("a is greter");
			
		}
	}
	
	public static void main2 (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enetr the value");
		int x  =sc.nextInt();
		if (x%2==0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}

	}
	public static void main1(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
            int age =sc.nextInt();
		if(age>18) {
			System.out.print("adult");
		}
		else {
			System.out.println("not adult");
		}
	}
} 