package Api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Legth {

	public static void main(String[] args) {
       List<String> list=  List.of("asdfsdfh","ywcvbheyt","erbgfbhnnjmmhnhnhmyry");
         
       //  .map((i)->{return i.length();})
       //  .forEach(i->System.out.println(i));
         Map<String,Integer> map= list.stream()
         .collect(Collectors.toMap(s->s,String::length));
         System.out.println(map);
       
         list.stream().map((i)->i.length()).forEach(System.out::println);
	}

}

