package api;

import java.util.List;

public class sort {

	public static void main(String[] args) {
        List.of(1,2,3,4)
        .stream()
        .sorted((j,i)->{return Integer .compare(i, j);})
        .forEach((i)->{System.out.println(i);});
        
		
	}

}
