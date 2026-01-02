package method_overloading;

public class first {

	public static void main(String[] args) {
		math m =new math();
	System.out.println(m.sum(34, 50,78));
	}
	

}

class math{
	public int sum(int a,int b){
		return a+b;
		
		
	}
	public int sum(int a,int b,int c) {
		return a+b+c;

	}
	
}