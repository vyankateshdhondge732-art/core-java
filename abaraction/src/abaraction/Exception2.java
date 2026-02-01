package abaraction;

public class Exception2 {
	public static void main(String[]args) {
		Demo d1 = new Demo();
	System.out.println(d1.add());
		
	}

}
class Demo{
	public int add() {
		try {
			
			//return 0;
			//throw new Exception("dfghgj");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return 8;
		}
		finally {
			System.out.println("finally");
			return 5;
		}
	}
}
