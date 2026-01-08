package Api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumer_1 {

	public static void main(String[] args) {
     Consumer<Integer> c = (i)->{System.out.println(i*5);};
     c.accept(10);
     
	}

}
