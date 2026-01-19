package Api;

import java.util.List;

public class sorted_2 {

	public static void main(String[] args) {
         
		List.of(34,443,23,23)
		.stream()
		.map(i->String.valueOf(i))
		.forEach(i->System.out.println(i));
	}

}
