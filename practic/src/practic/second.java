package practic;

public class second {

	public static void main(String[] args) {
        Secon s1 =Secon.print();
        Secon s8 =Secon.print();
        Secon s3 =Secon.print();
        Secon s2 =Secon.print();

	}

}
class Secon{
	public static int count;
	private Secon() {
		count=count+1;
		System.out.println("i am vanky");
		
	}
	public static Secon print() {
		Secon ss = new Secon();
		return ss;
		
				}
}
