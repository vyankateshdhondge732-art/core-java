package Interviewqutions;

public class palindrom_1 {

	public static void main(String[] args) {

		int num = 312321;
		int original = num;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		if (original == rev) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom ");
		}
	}

}
