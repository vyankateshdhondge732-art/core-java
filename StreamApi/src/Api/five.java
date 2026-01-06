package Api;

public class five {

	public static void main(String[] args) {
       Sam<Integer,String> s =(t1,t2)->{
    	   return new StringBuffer(" hello ").append(t1+t2).toString();
    	//   System.out.println(t1+t2);
       };
       
       String num = s.fun(4, 5);
       System.out.println(num);
	}

}
 interface Sam<T,R>{
	 R  fun(T t1,T t2);
 
	 }
	 
 

  