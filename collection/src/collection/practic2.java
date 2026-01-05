package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class practic2 {

	public static void main(String[] args) {

		TreeSet <Bmw> bt =new TreeSet<>();

		   bt.add(new Bmw(3,"sham",30));
		   bt.add(new Bmw(1,"venky",40));
		   bt.add(new Bmw(2,"Amar", 0));
	}

}
 class Bmw implements Comparator<Bmw>{
	 int id;
	 String name;
	 int price;
	 
	 public Bmw (int id,String name,int price) {
		 this.id =id;
		 this.name=name;
		 this.price=price;
	 }
	 
	 public String toString() {
		 return this.name;
	 }
//	 class idsame implements Comparator<Bmw>{
//
//			@Override
//			public int compare(Bmw o2, Bmw o1) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o2.id, o1.id);

 
	 
	 @Override
	 public int compare(Bmw o1, Bmw o2) {
				return Integer.compare(price, id);
	 }
 }