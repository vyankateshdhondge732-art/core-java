package Api;

import java.util.List;

public class new_1 {

	public static void main(String[] args) {
          
		 List.of("jsal","djjd","jdj")
		 .stream()
		 .map((i)->{return i.length();})
		// .map(i->Integer.parseInt(i))
		 .forEach(i->System.out.println(i));
		 
	}

}
