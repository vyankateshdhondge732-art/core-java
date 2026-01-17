package api;

import java.util.List;

public class fifth {

	public static void main(String[] args) {
       
		  List.of(65889,95848,94893,7654)
		  
		   .stream()
		   .map(i->String.valueOf(i))
		   .map(i->i.length())
		   .forEach(i->System.out.println(i));
		   
		    
	}

}
