package newprogram;

import java.util.Scanner;

public class newarray {
	static Scanner sc = new Scanner(System.in);

	public static void acceptecord(int mark[]) {

		for (int index = 0; index < 5; index++) {
			System.out.print("enter the number");
			mark[index] = sc.nextInt();

		}
	}

	public static void printrecored(int mark[]) {
		for (int index = 0; index < 5; index++) {
			System.out.print(mark[index] + "  ");

		}

	}

	public static void main(String[] args) {
		int mark[] = new int[5];
		acceptecord(mark);
		printrecored(mark);

	}

}
