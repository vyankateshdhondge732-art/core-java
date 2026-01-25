package api;

import java.util.List;

public class All {

	public static void main(String[] args) {
          
		List.of("lko","kdkdk","kfkk","dkdk")
		.stream()
		.map(i->i.length())
		.forEach(i->System.out.println(i));
		
	List<String> li=List.of("djfjf","eihdd","dkdjj");
	   Integer sum=li.stream()
	.map(i->new String(i).valueOf(i).length())
		.reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
	

}
