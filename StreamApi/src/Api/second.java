package Api;

public class second {

	public static void main(String[] args) {
         
		add<Integer>a= new Car();
		 a.ad(90,10);
	}

}                                  //first lamada  
interface add<T>{
	void ad(T t1,T t2);
}
class Car implements add<Integer>
{

	@Override
	public void ad(Integer t1, Integer t2) {
        System.out.println(t1+t2);		
	}
}