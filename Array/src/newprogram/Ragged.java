package newprogram;

import java.util.Arrays;
import java.util.Scanner;

///////////////////////////////////////////////   Ragged array    ///////////////////////////////////////////////////////////////
public class Ragged {
	public static void showRecord(int[][] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println(Arrays.toString(arr[index]));
		}
		System.out.println();
	}

	public static void acceptRecored(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("enter the value");
				arr[row][col] = sc.nextInt();
			}
			System.out.println();
		}
		

	}

	public static void printRecored(int arr[][]) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[][] = new int[4][]; /// Ragged array

		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[1];

		acceptRecored(arr);
		printRecored(arr);
		showRecord(arr);

		// int ar[] = new int[5];
		// for (int index = 0; index < 5; index++) {
		// System.out.print(ar[index] + " ");
	}
	// System.out.println();

}

//}
