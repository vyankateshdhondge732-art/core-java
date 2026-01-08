package Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 14);
		List<Integer> list1 = Arrays.asList(10, 20, 45);

		List<List<Integer>> list2 = new ArrayList<>();
		list2.add(list1);
		list2.add(list);

		List<List<Integer>> list3 = new ArrayList<>();
		
		list3.add(list1);
		list3.add(list);
		
		System.out.println(list2);

		Two s1 = new Two();
		s1.accept(list3);

	}

}

class Demo_q implements Consumer<List<Integer>> {

	public void accept(List<Integer> t) {
		int sum = 0;

		for (int i : t) {
			sum += i;
		}
		System.out.println("Sum " +sum);
	}
}

class Two implements Consumer<List<List<Integer>>> {

	public void accept(List<List<Integer>> t) {
		for (List<Integer> list : t) {

			Demo_q list2 = new Demo_q();
			list2.accept(list);
		}
	}

}
