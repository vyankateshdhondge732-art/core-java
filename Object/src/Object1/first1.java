package Object1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class first1 {

	public static void main(String[] args) {
     List<Integer>list=new LinkedList<>();
     
     list.add(11);
     list.add(12);
     list.add(13);
     list.add(14);
     list.add(15);
     list.add(16);
     list.add(17);
    System.out.println(list);
    list.addFirst(13);
    list.addLast(16);
    List<Integer>li =Arrays.asList(12,13,14,15,16,17);	
    		
    		
    
    System.out.println(list);
    System.out.println(list.contains(null));
    System.out.println(list.hashCode());
    System.out.println(list.isEmpty());
    System.out.println(list.size());
    System.out.println(list.reversed());
    System.out.println(list.getClass());
    System.out.println(list.size());
    
    Iterator<Integer>it = li.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    System.out.println("======");
    for(int i:li) {
    	System.out.println();    }
	}
	

}
