package newprogram;

import java.util.Scanner;

public class AArrry {
	static Scanner sc = new Scanner(System.in);                  // use the Scanner method in class in array

	public static void acceptrecored(int mark[]) {
		System.out.println("enter the number ");
		for (int index = 0; index < 5; index++) {
			mark[index] = sc.nextInt();
		}
	}
	public static void printrecored(int mark[]) {
		for (int index = 0; index < 5; index++) {
			System.out.print(mark[index]+" ");
			System.setOut(null);
		}
	}
	public static void main(String[] args) {
		int mark[]=new int[5];
		acceptrecored(mark);
		printrecored(mark);
	}
}
