package program2;

import java.util.List;

public class twetl1 {

	public static void main(String[] args) {
	       List<String> list= List.of("abc","hiu","kji","pio");
           String result= list.stream()
          .reduce(" ", (a,b)->a+b);
           System.out.println(result);
    

	}

}
