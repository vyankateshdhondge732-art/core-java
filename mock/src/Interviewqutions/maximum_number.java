package Interviewqutions;

public class maximum_number {

	public static void main(String[] args) {
      
		int arr []= {10,1,2,3,4,4,7,8,30};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
