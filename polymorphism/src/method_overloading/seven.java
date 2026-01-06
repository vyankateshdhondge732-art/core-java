package method_overloading;

public class seven {

	public static void main(String[] args) {
     Pic d1 = new Pic();
       d1.add(02);
	}
}
abstract class Demo1{
	abstract public void add(int id);
	
	public void print() {
		System.out.println("public method is calling");
	}
}
class Pic extends Demo1{

	@Override
	public void add(int id) {
				System.out.println("calling");
	}
	
}
