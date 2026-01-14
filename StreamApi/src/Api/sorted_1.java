package Api;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class sorted_1 {

	public static void main(String[] args) {
      List<String> list= List.of("abcd","bhav2","kfjjjkkj");
           
      Function<String,Integer> fun=(i)->{return i.length();};
      
    //  Consumer<String> fun2 =(i)->{System.out.println(i);};
      
      list.stream().map(fun).forEach(System.out::println);
           
           

           
     	}

	}

