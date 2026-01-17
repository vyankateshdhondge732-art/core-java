package api;

import java.util.List;

public class four {

	public static void main(String[] args) {
          
		 List.of("abc","def","ghi","jkm")
		 .stream()
		 .map(i->new StringBuffer (i).reverse().toString())
		 
		// .peek(i->System.out.println(i+"5"))
		 .forEach(i->System.out.println(i));
		 
	}
}
