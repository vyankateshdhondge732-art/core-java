package Refer;

import java.util.List;

public class ten {

	public static void main(String[] args) {
		List.of("jejj","dkn","edkn")
		.stream()
		.map(i->i.length())
		.forEach(i->{System.out.println(i);});
              
		
		
	}

}
