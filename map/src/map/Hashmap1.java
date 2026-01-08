package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap1 {

	public static void main(String[] args) {
       HashMap<Integer,Integer> lp = new HashMap<>();
       
       lp.put(null, null);
       lp.put(1, null);               //   1 is key and null value
       lp.put(2, null);                   // only imp key
       lp.put(3, null);
       lp.put(4, null);
       lp.put(6, 9);
       lp.put(1, null);
       System.out.println(lp);
       for (Entry<Integer, Integer> pp :lp.entrySet()) {             // entry set is interfac 
    	   System.out.println(pp.getKey()+" ="+pp.getValue());
       }
	}

}
