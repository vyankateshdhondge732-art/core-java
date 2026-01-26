package Api;

import java.util.List;

public class tewal {

	public static void main(String[] args) {
          
	          List<Integer> list=   List.of(8,9,8,7,4,7,2,3,2);
		    list  .stream()
		      .distinct()
		      .sorted((i,j)-> Integer.compare(i, j))
		      .forEach(i->System.out.println(i));
		      
		      
		      
	}

}
