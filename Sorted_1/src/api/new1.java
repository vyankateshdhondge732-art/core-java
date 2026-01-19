package api;

import java.util.List;
import java.util.function.Function;

public class new1 {

	public static void main(String[] args) {
        List.of("12","746","847")
        .stream()
        .map(i->Integer.parseInt(i)).map(i->i.getClass())
        .forEach(System.out::println);
        
	}

}
