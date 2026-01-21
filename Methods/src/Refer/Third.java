package Refer;

import java.util.List;

public class Third {

	public static void main(String[] args) {
            
		List.of("abc","bcd","efg","def")
		.stream()
		.map(String::length)
		.forEach(System.out::println);
	}

}
