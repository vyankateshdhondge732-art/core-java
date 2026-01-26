package abc;

import java.util.List;

public class third {

	public static void main(String[] args) {
       List<String>lis4=   List.of("kfjd","kdkkd","dkdk");
           String sum=lis4 .stream()
            .reduce("",(a,b)->a+b);
            System.out.println(sum);
	}

}
