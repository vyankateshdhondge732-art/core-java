package collection;

import java.util.Objects;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		
		Car c1 = new Car(101," BMW ",8900);
		Car c2 = new Car(102," HONDA ",4500);
		Car c3 = new Car(101," TVS ",890);
		         
      TreeSet <Car> bt =new TreeSet<>();
      bt.add(c1);
      bt.add(c2);
      bt.add(c3);
      
      System.out.println(bt);
	}

}
class Car implements Comparable<Car>{
	
	int id;
	String name;
	double price;
	 
	public Car(int id,String name,double price) {
		this.id = id;
		this.name =name;
		this.price=price;
		
	}
	public String toString() {
		return this.id+ ""+this.name+this.price;
	}
	public int hashCode() {
		return Objects.hash(id,name,price);
		
	}
//	public boolean equals(Object obj) {
//		Car st =(Car)obj;
//		return this.id==st.id && this.name.equals(st.name)&&
//				this.price==st.price;
//	}
	@Override
	public int compareTo(Car o) {
		
		return this.id-o.id;
	}
	
	}

