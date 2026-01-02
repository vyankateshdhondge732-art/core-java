package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
           ArrayList<String> st = new ArrayList<String>();
           
           st.add("A");
           st.add("B");
           st.add("C");
           st.add("D");
      
          Iterator <String> it = st.iterator();
        		   
         while (it.hasNext()) {
          System.out.println(it.next());
         }
         
         System.out.println("==========================================");
         ListIterator<String> ite = st.listIterator();
         while(ite.hasNext()) {
        	 System.out.println(ite.next());
         }
         System.out.println("==================================================");
         
         while(ite.hasPrevious()) {
        	 System.out.println(ite.previous());
         }
         while(ite.hasPrevious()) {
        	 System.out.println(ite.previous());
        	 
         }
          
	}

}
