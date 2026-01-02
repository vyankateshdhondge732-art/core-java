package program2;

class Hide {
	private int num1;
	private int num2;
	private static int num3;

	Hide() {
		num1 = 5;
		num2 = 6;
	}

	static {                             //// static use /////
		num3 = 500;
	}
        public void getrecored() {
		System.out.println("nun1:" + num1);
		System.out.println("num2:" + num2);
		System.out.println("num3:" + num3);
	}
}
public class Datee1 {
	public static void main(String[] args) {
		Hide h1 = new Hide();
		Hide h2 = new Hide();
		h1.getrecored();

	}

}
