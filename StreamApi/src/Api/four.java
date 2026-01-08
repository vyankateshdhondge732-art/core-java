package Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class four {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30,40,50);
		List<Integer> list1= Arrays.asList(10,90,10);
		List<Integer> list2= Arrays.asList(80,90,10);
		
		List<List<Integer>> li=new ArrayList<>();
		li.add(list1);
		li.add(list2);
		 System.out.println(li);
		denim d = new denim();
		d.accept(li);
		
	}

}
class gav implements Consumer<List<Integer>>{

	@Override
	public void accept(List<Integer> t) {
        int sum =0;
        for(int i :t) {
        	sum+= i;
        }
           System.out.println(sum);
	}
	
}
class denim implements Consumer<List<List<Integer>>>{

	public void accept(List<List<Integer>> t) {
	      for(List<Integer> list:t) {
	    	  
	    	  gav f = new gav();
	    	  f.accept(list);
	      }
		
	}
	class pink implements Consumer<List<List<List<Integer>>>>{

		@Override
		public void accept(List<List<List<Integer>>> t) {
			           
			for(List<List<Integer>> list1:t){
				 for(List<List<Integer>> list2 :t) {
					 
					 denim d1 = new denim();
					 d1.accept(list1);
					 d1.accept(list2);
				 }
				 
			}
			
		}
		
	}     
	
}
