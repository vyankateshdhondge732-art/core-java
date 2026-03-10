package Interviewqutions;

public class palindrom {

	public static void main(String[] args) {

		
		int num =2212;
		int original =num;
		int rev=0;
		
		while(num>0){
			int res=num%10;
			rev=rev*10+res;
			num=num/10;
					}
		if(original==rev) {
			System.out.println("palindrom");
		}
		else {
			 System.out.println("not palindrom"); 
			
		}
		
	}

}
