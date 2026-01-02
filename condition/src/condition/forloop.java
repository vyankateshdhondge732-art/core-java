package condition;

import java.util.Arrays;
import java.util.Scanner;

public class forloop {
	public static void main (String[]args) {
		int arr[]=new int [] {10,30,40,50,60,20};
		for (int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {			
				}
				int temp=arr[i];
				arr[i]=arr[j];///////////////// xxxx/////////////////
			   arr[j]=temp;
			}
		}
		
		System.out.println("accendin order");
		for(int num:arr) {
			System.out.print(num + " ");11
		}

	}
	
	
	//////////////////////////// /////////////// Revers  //////////////
	public static void main8(String[]args) {
		int arr[]=new int [] {10,30,40,50,60,};


		for(int i=arr.length-1;i>=0;i--) {
		//	System.out.println("array int revers oreder:");

		System.out.print(arr[i]+" ");
		
	}
	}
	//////////////////////// MIn Max ////////////////////////
	public static void main5(String[]args) {
		int arr[]=new int[] {10,20,30,40,50,60,};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]<min) 
				min=arr[i];
			
			if(arr[i]>max) 
				max=arr[i];
			
		}
		System.out.println(min);
		System.out.println(max);
		
	}
	//////////////////////sort//////////////////////////
	///
	public static void main23(String[]args) {
		int arr[]=new int[] {70,40,10,20,30,50,};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
////	for (int num:arr) {
	//	System.out.println(num +" ");
	}
//	}
	////////////////// Average//////////////////////////////
	
	public static void main2(String[]args) {
		int arr[]=new int[] {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
	
		}
		double average=sum/arr.length;
		System.out.println(average);

		
	}
	////////////////////////  Sum //////////////////////////////////

	public static void main1(String[] args) { 
		int arr[]=new int[] {10,20,30,40};
	     int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println("sum:"+sum);
		}
			
}
}