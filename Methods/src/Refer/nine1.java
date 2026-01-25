package Refer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class nine1 {

	public static void main(String[] args) {
           
		 Map<Object,Object> li=  List.of("abc","bcd","oiuy")
		    .stream()
		    .collect(Collectors.toMap(i->i,i->i.length()));
		   System.out.println(li);
		   
	          Map<Integer,List<String>>li2=	List.of("kfjkf","fjbfj","fkfkkf")
		.stream()
		.collect(Collectors.groupingBy(i->i.length()));
		System.out.println(li2);
	}

}
