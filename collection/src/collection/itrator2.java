package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class itrator2 {

	public static void main(String[] args) {
      ArrayList s = new ArrayList<String>();
      
      s.add("e");
      s.add("j");
      s.add("o");
      s.add("w");
      
      Iterator <String> it = s.iterator();
      
      while (it.hasNext()) {
    	  System.out.println( it.next());
      }
      ListIterator<String> ste=  s.listIterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }
      while(((ListIterator<String>) it).hasPrevious()) {
     	 System.out.println(((ListIterator<String>) it).previous());
      }


	}

}
