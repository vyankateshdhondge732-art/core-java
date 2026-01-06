package Api;

public class four1 {
	public static void main(String[] args) {
        
    //  fogg <Integer> s =(t1,t2);
		
		fogg<Integer> s=(t1,t2)->{
			System.out.println(t1+t2);
		};	
		s.add(10, 20);	
	}
}
interface fogg<T>{
	void add(T t1,T t2);
}
class Asha implements fogg<Integer>{
	public void add(Integer t1,Integer t2) {
		System.out.println(t1+t2);
	}
	
}