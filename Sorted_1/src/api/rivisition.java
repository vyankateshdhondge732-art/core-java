package api;

import java.util.function.BiFunction;

public class rivisition {

	public static void main(String[] args) {
      BiFunction<String,String,Integer> bi=(t,u)->t.length()+u.length();
      System.out.println(bi.apply("8765", "ijhb"));
      
      BiFunction<Integer,Integer,Integer> bi1=(t,u)->t+u;
      System.out.println(bi1.apply(98, 21));
      
      BiFunction<String,String[],Integer> bi3=(t,u)->t.length()+u.length;
      System.out.println(bi3.apply("8987",new String[]{"jdhf" }));
	}

}