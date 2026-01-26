package Api;

import java.util.List;

public class reduse {

	public static void main(String[] args) {
       
		List.of(10,20,30,40)
		.stream()
		.filter(i->i<30)
		//.reduce(0,(a,b))
		.forEach(i->System.out.println(i));
		
		System.out.println("*********************");
		
	  List<String>li3=	  List.of("sjiod","dkdj","dkdk");
		  String Add= li3   .stream()
		      .reduce("",(a,b)->a+b);
		      System.out.println(Add);
		  
		     System.out.println("=============");
		     
		      List.of("king","love","kjin")
		      .stream()
		      .map(i->i.length())
		      .forEach(i->System.out.println(i));
	}

}
