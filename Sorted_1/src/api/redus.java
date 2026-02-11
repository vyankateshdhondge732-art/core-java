package api;

import java.util.List;

public class redus {

	public static void main(String[] args) {
         List<Integer>lis=List.of(87,9323,322,22);
             int sum=lis .stream()
                    .reduce(0,(a,b)->a+b);
               System.out.println(sum);      
	}

}
