package api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rivision {

	public static void main(String[] args) {
            
//	       List<Integer>list=	List.of(8,9,4);
//		int sum=  list .stream()
	
//		.reduce(0,(a,b)->(a%b));
//			System.out.println(sum);)
			
//       List<String>list=List.of("amar","om","vankatesh");
//                  String st =list.stream()
//                		  .map((i)->{eturn i.length();})
//                		  .forEach((i)->{System.println.out(i)};
//           
				
		  List<String> list=List.of("Amar","Vyan","Omka");
		 List < String> list12=List.of("fkfj","fjfn","hskf");
		 
		 List<List<String>> list13=List.of(list,list12);
           int sum=  list13.stream().flatMap(i->i.stream()).map(i->i.length())
		      
		       .reduce(0,(a,b )->(a+b));
                System.out.println(sum); 
                
                
                List<String> listt = List.of("absd","dgsh","dh");
               int sum1 = listt.stream().map(i->i.concat("patil").length()).reduce(0,(i,j)->(i+j));
                
                System.out.println(sum1);
		
} 
}