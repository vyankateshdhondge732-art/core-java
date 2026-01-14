package Api;

import java.util.List;

public class secon1 {

	public static void main(String[] args) {
         List.of("wer","irur","iop")
         .stream()
         .map((s)->{return new StringBuffer(s).reverse().toString();})
         .forEach((i)->{System.out.println(i);});
	}

}
