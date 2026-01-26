package Api;

import java.util.List;

public class eleven {

	public static void main(String[] args) {
        
		List.of("you","love","I")
		.stream()
		.map(i->new StringBuffer(i).reverse().toString())
		.forEach(i->System.out.println(i));
		
		List.of("java","jabd","kldkfj")
		.stream()
		.map(i->i.length())
		.forEach(i->System.out.println(i));
		
		System.out.println("****************");
		
		
	  List<String> il=	List.of("king","kloh","kfjcj","mmdc");
		     String li=il.stream()
		       .reduce("",(a,b)->a+b);
		 System.out.println(li);
		 
		  System.out.println("***************");
		 
		List.of(90,80,70,60,50)
		 .stream()
		 .sorted((i,j)->{ return Integer.compare(j, i);})
		 .forEach(i->System.out.println(i));
		// .forEach((i)->{System.out.println(i);});
		 
		       
		    				    		 }
	
	}


