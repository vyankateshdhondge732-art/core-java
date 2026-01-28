package Optinal;

import java.util.Optional;

public class optional_1 {

	public static void main(String[] args) {
            
		
Optional<String> ops=Optional.ofNullable("shiva");  // ofnullable method  null accept krte 
		 System.out.println(ops.isPresent());  // optional madhe value aahe ka ka nahi chec krto 
		                                       //value asel tr tru or nsel tr false   
		 System.out.println(ops.orElse("heloo"));//value asl tr ispresent print krte or heloo 
	 ops.ifPresent((i)->{System.out.println(i.toUpperCase());});// value asel tr lamada excut hot nsta kahit 
	                                                          // execute hot nhi
	 
	 ops.ifPresentOrElse(System.out::println,              
	 ()->{System.out.println("nahi bhetli value re");}); // value nslyvr ha part execut hoto
	}

}
