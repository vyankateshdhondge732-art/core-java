package newprogram;

import java.util.Scanner;

public class newscanner {

	static Scanner sc = new Scanner(System.in);
	static int arr[][] = new int[3][5];

	public static void acceptRecprd( int arr[][]) {                        /// array use in accept record methid

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.println("Enter the value");
				arr[row][col] = sc.nextInt();
		         	}
		        }
		    }         
		public static void printrecord( int arr[][]) {                      // array use in print record 
			for (int row =0;row<3;row++) {
				for(int col=0;col<5;col++) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}

	

	public static void main(String[] args) {
		//int arr [][]=int  arr[3][5];
		acceptRecprd(arr);
		printrecord(arr);
		

	}

}
