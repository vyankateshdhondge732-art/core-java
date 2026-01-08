package Api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class predecate {


	public static void main(String[] args) {
		  
		 Demo d = new Demo();
		 
		System.out.println(d.test(3));
		
		Predicate<String> pred =(s)->{
			return s.length()>10;
		};
		System.out.println(pred.test("Ajihih6234335646765879"));

		}
	}

class Demo implements Predicate<Integer>{
	
	public  boolean test(Integer t) {
		return t>10;
	 
}
}