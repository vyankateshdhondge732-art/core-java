package Api;

import java.util.List;

public class thired {

	public static void main(String[] args) {
     //  List<String>lis=List.of("jik","kdj","jdj");
		System.out.println(
         List.of(1,2,8)
         .stream()
         .anyMatch((i)->{return i<5;}));
         
        
	}

}
