package Refer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class eigth1 {

	public static void main(String[] args) {
    Map<Object, Object>li= List.of("kgf","king","love")
            .stream()
           .map(i->i.toUpperCase())
          //  .map(i->i.length())
            .collect(Collectors.toMap(i->i,i->i.length()));
            System.out.println(li);
            
            Map<Integer,List<String>> li2=   List.of("ine","kaij","kldo")
            .stream()
           // .filter()
            .collect(Collectors.groupingBy(i->i.length()));
            
            System.out.println(li2);
            
	}

}
