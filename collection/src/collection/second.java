package collection;

import java .util.HashSet;
import java.util.Objects;
import java.util.Set;


public class second {

	public static void main(String[] args) {
		HashSet <car>str=new HashSet<car>();
		car c1 = new car(34,656);
		car c2 = new car(45,7688);
		
		str.add(c1);
		str.add(c2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1);
		System.out.println(c2);
		
	}
	}
class car {
	double price;
	int model;
	
	public car (double price,int model) {
		this.price=price;
		this .model=model;
		
	}
	
	public String toString () {
	System.out.println("======toString====");
		return this.price+" "+this.model;
		
		}public int hashCode() {
		System.out.println("======hashcode=====");
		return Objects.hash(model,price);
		

	}
	
	public boolean equles(Object obj) {
		car cd = (car)obj;
	return this.price==cd.price&&this.model==cd.model;
		}
}