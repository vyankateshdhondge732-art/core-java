package program2;

class program{
	private int num1;
	private int num2;
	private  static int num3;              /// main point  
	
	program(int num, int num2){            // parameterized constrctur
		this.num1 = num;                   //  int name same aslyvr  ( this )  gevc lagty//
		this.num2 = num;	
	}
	static {                               // use the static
		num3 =500;		
	}
	void getrecored(){
		System.out.println("num1 is=" +num1);
		System.out.println("num2 is =" + num2);
		System.out.println("num3 is ="+num3);
		System.out.println();	
	}
}
public class day11 {
	public static void main(String[]args) {
		
		program p1=new program(65, 76  );
		program p2= new program(748, 784);
		p1.getrecored();
		p2.getrecored();
	}

}
