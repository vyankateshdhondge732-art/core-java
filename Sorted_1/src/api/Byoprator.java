package api;

import java.util.List;
import java.util.function.BinaryOperator;

public class Byoprator {

	public static void main(String[] args) {
    BinaryOperator<Integer>bi=(a,b)->a+b;
          System.out.println(bi.apply(98, 77));
          
          
          List<Integer>list=List.of(89,74,38,23);
                 int sum=list.stream()
                		 .reduce(0,(a,b)->a+b);
                 System.out.println(sum);
                 
                 List.of("kjh","gjsj","skjjs")
                   .stream()
                   .map((i)->{return i.length();})
                   .forEach((i)->{System.out.println(i);});
                     
	}

}
