package api;

import java.util.List;

public class First_1 {

	public static void main(String[] args) {
		 List<Integer> list = List.of(1,2,36,6574,748578,56547);
		 int sum = list.stream()
				 .reduce(1,(a,b)->a*b);
		 System.out.println(sum);

		
	}

}
