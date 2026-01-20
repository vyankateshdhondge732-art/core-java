package api;

import java.util.ArrayList;
import java.util.List;

public class Reduce {  

	public static void main(String[] args) {
       List<String> list= List.of("abc","hiu","kji","pio");
                 String result= list.stream()
                .reduce(" ", (a,b)->a+b);
                 System.out.println(result);
          
             
	}

}
