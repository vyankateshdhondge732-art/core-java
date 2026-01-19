package Api;

import java.util.List;

public class short2 {


	public static void main(String[] args) {
          
		List.of(67,39,89,89)
		.stream()
		.sorted((i,j)->{return Integer.compare(j, i);})
		.forEach(i->{System.out.println(i);});
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		List.of("kfjjd","djhd","dkhjfj","kjfhj")
		.stream()
		.map((s)->{return s.length();})
		.forEach(i->System.out.println(i));
	 
		  System.out.println("**************");
		 

	}

}
