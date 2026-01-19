package Api;

import java.util.List;

public class short_3 {

	public static void main(String[] args) {
		   List.of(98,80,97,45)
	       .stream()
	       .sorted((i,j)->{return Integer.compare(j, i);})
	       .forEach(i->System.out.println(i));
	       
	       
	   		List.of(34,443,23,23)
	   		.stream()
	   		.map(i->String.valueOf(i))
	   		.forEach(i->System.out.println(i));
	   	

		}

	

	}


