package collection;

import java.util.List;
import java.util.Stack;

public class first2 {

	public static void main(String[] args) {
     List<Integer> li = new Stack<>();
     
     ((Stack<Integer>) li).push(12);
     li.push(13);
     li.push(14);
     li.push(null);
     li.push(16);
     li.push(17);
     li.push(18);
     li.push(19);
     
     System.out.println(li.peek());
     System.out.println(li.pop());
	}

}
