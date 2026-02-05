package Optinal;

import java.util.Optional;

public class six {

	public static void main(String[] args) {
		
		
		
//		  //       String st1=new String(null);
//				String st2=("amar");;
//				String st3=(null);
//				
//				System.out.println(st1+st2);
//				System.out.println(st1+st3);
//				System.out.println(st3+st2);
//
				
         Optional<String> op=Optional.ofNullable(null);
         System.out.println(op.isPresent());
         System.out.println(op.orElse("raja"));
         
         op.ifPresent((i)->{System.out.println(i.toUpperCase());});
         
         
         op.ifPresentOrElse(System.out::println,              
        		 ()->{System.out.println("nahi bhetli value re");});
	}

}
