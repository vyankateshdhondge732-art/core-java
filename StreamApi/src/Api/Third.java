package Api;

public class Third {

	public static void main(String[] args) {

		show<Integer> s = new Bike();
		
		s.add(65,90);
	}

}
interface show<T>{
	void add(T t1,T t2);
}

class Bike implements show<Integer>{

	@Override
	public void add(Integer t1, Integer t2) {
            System.out.println(t1+t2);		
	}
	
}
