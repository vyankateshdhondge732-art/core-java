package condition;

public class prime {

	public static void main(String[] args) {

		for (int num =2;num<100;num++) {
			boolean prime=true;
			for (int i=2;i<num;i++) {
				if(num%i==0) {
				prime=false;           ///prime number
					break;
				}
			}
			if(prime)
			System.out.println(num);
		}
		
	}

}
