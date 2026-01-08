package Api;

import java.util.function.Predicate;

public class Third1 {

	public static void main(String[] args) {

		Predicate<Integer> pred = (i) -> {
			return i.toString().startsWith("1");
		};
		Predicate<Integer> p2 = (i) -> {
			return i > 100;
		};

		Predicate<Integer> p3 = pred.and(p2);

		System.out.println(p3.test(9));
	}

}
