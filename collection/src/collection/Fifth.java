package collection;

import java.util.TreeSet;

public class Fifth {
	

	public static void main(String []args) {
		 
		 TreeSet <Car1> set = new TreeSet<Car1>();
		 
		 Car1 c1 = new Car1(12,34343,"BMW");
		 Car1 c2 = new Car1(13,32332,"HondaCity");
		 
		 set.add(c2);
		 set.add(c1);
		 System.out.println(set);
	 }
	}
class Car1 {
		 int number;
		 double price;
		 String name;
	 
	  public Car1(int number,double price,String name) {
		  this.number=number;
		  this.price=price;
		  this.name=name;
	  }
	 
	 
	 

	public String toString() {
		return "Car [number=" + number + ", price=" + price + ", name=" + name + "]";
	}



	 
	 }
