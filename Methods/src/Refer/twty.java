package Refer;

import java.util.List;

public class twty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=List.of(10, 20, 30, 40, 120,87)
				.stream()
			  .filter(A::add)
				.reduce(0,A::noo);
				//.forEach(A::sam);
				System.out.println(sum);


	}

}
