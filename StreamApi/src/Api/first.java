package Api;

import java.util.List;

public class first {

	public static void main(String[] args) {

          List.of("poiy","kjhh","jbbhj")
          .stream()
          .map((s)->{return s.length();})
          .forEach((i)->{System.out.println(i);});
          
	}
	}

