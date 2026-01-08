package practic;

public class second1 {

	public static void main(String[] args) {
		int age = 19;
		try {
		if (age<18) {                                     //Exception throw ex
			throw new Exception("Invadid age");
			
		}
		System.out.println("valid for vote");
		}

	
	 catch (Exception ex) {
		System.out.println(ex.getMessage());
	}

}
}