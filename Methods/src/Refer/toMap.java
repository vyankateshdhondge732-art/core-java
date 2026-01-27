package Refer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMap {

	public static void main(String[] args) {
      Map<String,Integer > fun= List.of("aaa","bbb","dkjk","kfkd")
           .stream()
           .collect(Collectors.toMap(i->i,i->i.length()));
            
          System.out.println(fun);
          
        	}

}
