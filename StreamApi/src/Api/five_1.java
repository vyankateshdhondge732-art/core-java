package Api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class five_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 14);
		List<Integer> list1 = Arrays.asList(27, 98, 90);

		List<List<Integer>> list3 = new ArrayList<>();
		list3.add(list1);
		list3.add(list);

		   System.out.println(list3);
		   
		sun s1 = new sun();
		s1.accept(list3);
	}
 
}

class nuab implements Consumer<List<Integer>> {

	@Override
	public void accept(List<Integer> t) {
		int sum = 0;
		for (int i : t) {
			sum = +i;

		}
		System.out.println(sum);
	}

}

class sun implements Consumer<List<List<Integer>>> {

	public void accept(List<List<Integer>> t) {
          for(List<Integer> list : t) {
        	  
        	  
        	  nuab n1 =new nuab();
        	  n1.accept(list);
        	  
          }
	}

}
