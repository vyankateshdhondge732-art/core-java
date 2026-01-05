package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset1 {

	public static void main(String[] args) {
         Set <Integer> set = new HashSet();
         set.add(11);
         set.add(12);
         set.add(13);
         set.add(14);
         set.add(15);
         set.add(16);
         System.out.println(set);
         set.remove(12);
         System.out.println(set.size());
         System.out.println(set.getClass());
         System.out.println(set.contains(14));
        // System.out.println(set.clone);
         System.out.println(set);
         
         Iterator<Integer>it =set.iterator();
         while(it.hasNext());
         System.out.println(it.next());
	}

}
