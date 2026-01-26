package abc;

import java.util.List;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List.of("kjin","kjfj","dkdjd")
 .stream()
 .map(i->i.length())
 .forEach(i->System.out.println(i));
	}

}
