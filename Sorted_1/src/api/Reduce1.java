package api;

import java.util.List;

public class Reduce1 {

	public static void main(String[] args) {
         List<Integer> li= List.of(56,32,23,23);
        	int sum=li.stream()
        		 .reduce(0,(a,b)->a+b);
        		 System.out.println(sum);
	}

}
