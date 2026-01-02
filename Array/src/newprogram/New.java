package newprogram;

public class New {
	
	public static void main(String[]args) {
		
		
	}
	public static void main3(String[]args) {
		int arr[]=new int[] {10,20,30,40,40,};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
	
			double average=sum/arr.length;
			System.out.println(average);
		}
		
	}

	public static void main1(String[] args) {
		int arr[]=new int [] {20,30,40,50,60,70};
	int	sum=0;
		for(int i =0;i<arr.length;i++) {
			sum=sum+arr[i];
			
			System.out.println(sum);
		}

	}

}
