package Api;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class second1 {

	public static void main(String[] args) {
       
	
		Predicate<String> pred=(s)->{
			StringBuffer sb =new StringBuffer(s);
			String s1=sb.reverse().toString();
			System.out.println(s1);
			return s1.equals(s1);
			
		};
		
		//System.out.println(pred.test("abcd"));
		
		Predicate<String> p2=(i)->{return i.length()>5;};
		
		Predicate<String> p3=pred.and(p2);
		System.out.println(p3.test("abcd")); 
	}
	

	}

	
		


