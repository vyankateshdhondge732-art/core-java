package abc;

import java.util.List;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List.of("dlfkf","dkdkd")
        .stream()
        .map(i->i.length())
        .forEach(i->System.out.println(i));
	}

}
