package Optinal;

import java.util.Optional;

public class option_2 {

	public static void main(String[] args) {
           
		Optional<String> ops= Optional.ofNullable("lod");
				System.out.println(ops.isPresent());
		System.out.println(ops.orElse("love"));
		
	                ops.ifPresent((i)->{System.out.println(i.length());});
	                ops.ifPresentOrElse((i)->{System.out::println,()->{System.out.println("heloo bebe);};)
	}

}
