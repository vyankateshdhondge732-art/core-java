package collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack_1 {
	public static void main(String[]args) {
		Stack<String> st = new Stack<>();
		st.push("Amrut");
		st.push("Amar");
		st.push("Aaryn");
		st.push("nilesh");
		st.push("om");
		st.push("rani");
		st.push("sam");
		st.push("sani");
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.remove("sam"));
		
		Iterator<String>it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
