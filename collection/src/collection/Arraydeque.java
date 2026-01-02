package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {

	public static void main(String[] args) {
	Deque<Integer> Deque = new ArrayDeque<Integer>();
	 
	Deque.add(80);
	Deque.add(90);
	Deque.add(30);
    System.out.println(Deque);

	Deque.push(79);
	Deque.push(38);
	Deque.push(67);
	Deque.push(87979);
	Deque.push(687);
	Deque.push(87);
	Deque.push(78);
	System.out.println(Deque);
	}

}
