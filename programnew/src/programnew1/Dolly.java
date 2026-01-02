package programnew1;

class next {
	public static void accepetRecord() {
		System.out.println("enter the block");
	}
}

public class Dolly {

	public static void displayrecored() {
		System.out.println("enter the static block");
	}

	public static void main(String[] args) {
		next.accepetRecord();
		displayrecored();
	}
}
