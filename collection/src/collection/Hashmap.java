package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
	// Map<Integer,String>map=new HashMap<Integer,String>();
       //  map.put(3, "str");
       //  map.put(2, "0r");
       //  map.put(1," str");
      //  System.out.println(map);	}

 String str="nakishorr";
        char []chars=str.toCharArray();
         Map<Character,Integer> map =new HashMap<>();
        


        for(char c:chars)
        {
         // int Frequnency=0;
         
          System.out.println(c);
          		
        	  map.put(c,map.getOrDefault(c,0)+1);
        
          
          
          
          
    	   
          
     
      }
        System.out.println(map);

}
}
