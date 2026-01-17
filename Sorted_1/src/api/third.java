package api;

import java.util.List;

public class third {

	public static void main(String[] args) {

		List.of("kfkf","jfjj","ihh","09","po","0")
		.stream()
       .map((s)->{return s.length();})
        .sorted((i,j)->Integer.compare(j, i))
       // .distinct()
      //  .peek(i->System.out.println(i+"a"))
        .forEach((i)->{System.out.println(i);});
		 
	}

}
