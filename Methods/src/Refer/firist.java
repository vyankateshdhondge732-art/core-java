package Refer;

import java.util.List;

public class firist {

	public static void main(String[] args) {

	int sum=List.of(10, 20, 30, 40, 120)
		.stream()
	  .filter(A::add)
		.reduce(0,A::noo);
		//.forEach(A::sam);
		System.out.println(sum);

	}

}

class A {
	public static boolean add(int i) {
		return i > 50;
		// System.out.println("");

	}

	public static void sam(int i) {
		System.out.println(i);
	}

	public static int noo(int i, int j) {
		return i + j;
	}
}
