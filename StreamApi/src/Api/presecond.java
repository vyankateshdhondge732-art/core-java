package Api;

import java.util.function.Predicate;

public class presecond {

	public static void main(String[] args) {
		
		Predicate<Integer> pred=(i)->{return i%2==0;};
		
		System.out.println(pred.test(39));
			
		}
 }


