package api;

import java.util.function.BiFunction;

public class Bi_Function {

	public static void main(String[] args) {
//		BiFunction<String,String[],Integer> Bi = (t,u)-> t.length()+u.length;
//		System.out.println(Bi.apply("2122",new String []{"sada"}));
//
//		BiFunction<String,String[],Integer>
//		Bi = (t,u)->t.length()+u.length;
//		System.out.println(Bi.apply("67487", new String[] {"sam","jioaj"}));
		
		BiFunction<Integer,Integer,Integer>
		Bi =(t,u)->t+u;
		
		
		System.out.println(Bi.apply(2,2));
	}

}
