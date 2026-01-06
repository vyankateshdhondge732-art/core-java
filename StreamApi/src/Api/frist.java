package Api;

public class frist {
       
		public static void main(String[]args) {
        	
      //  	I_add<Integer>iadd= new Concrete();
        
  //  	I_add<Integer>iadd=(t1,t2)->(t1+t2);
			
       	I_add<Integer>iadd=(t1,t2)->{
       		System.out.println(t1+t2);
        	};
        	                                 //  lamada 
        	iadd.add(10, 20);
        }
}
interface I_add<T>{
	void add(T t1,T t2);
}
//
//class Concrete implements I_add<Integer>
//{
//
//	@Override
//	public void add(Integer t1, Integer t2) {
//		System.out.println(t1+t2);
//		
//	}
//	
//}