package Refer;

import java.util.List;

public class four {

	public static void main(String[] args) {
          
		int sum=List.of(90,45,34,23,43)
				.stream()
			  .filter(A::add)
				.reduce(0,A::noo);
			//.forEach(A::sam);
			System.out.println(sum);

	}

}
