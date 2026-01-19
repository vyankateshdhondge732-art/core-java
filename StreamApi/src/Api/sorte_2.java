package Api;

import java.util.List;

public class sorte_2 {

	public static void main(String[] args) {
       List.of(98,80,97,45)
       .stream()
       .sorted((i,j)->{return Integer.compare(j, i);})
       .forEach(i->System.out.println(i));
	}

}
