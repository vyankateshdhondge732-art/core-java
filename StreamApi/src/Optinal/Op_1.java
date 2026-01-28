package Optinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Op_1 {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		
		list.add(12);
		list.add(34);
		list.add(null);
		
		Optional<Integer> op = list
				.stream()
				.filter(i->i!=null)
				.reduce((i,j)->i+j);
		System.out.println(op.get());

		List<String> list1 = new ArrayList<>(); 
//		 list1.add("a");
//		 list1.add("b");
//		 list1.add(null);
//		 
		 Optional<String> ops =list1
				 .stream()
				// .filter(i->i!=null)
				// .map(i->i.toUpperCase())
				// .map(i->i.length())
				 .reduce((i,j)->i+j);
		 ops.ifPresent(System.out::println);
		 ops.ifPresentOrElse(System.out::println,()->System.out.println("nhi aala re "));
                 //  .map(String::toUpperCase)
				// .filter(Objects::nonNull)
				// .map(String::length)
				// .reduce((i,j)->j+i);
				// .forEach(System.out::println);
				 
		 		
		
	}

}
