package collection;

import java.util.Objects;
import java.util.TreeSet;

public class comprable {

	public static void main(String[] args) {
		
		Shop s = new Shop(90,"arya","sona");
		Shop s1 = new Shop(90,"arya","sona");
		Shop s2= new Shop(90,"arya","sona");
		Shop s3 = new Shop(90,"arya","sona");
		
		TreeSet<Shop> st=new TreeSet<>();
		
		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		System.out.println(st);
	}

	}

 class Shop implements Comparable<Shop>{
	 
	 
	 	 int id;
	 String name;
	 String name2; 
	 
	 public Shop(int id,String name,String name2) {
		 this.id=id;
		 this.name=name;
		 this.name2=name;
	 }
	 public String toString() {
		 return this.id+ " "+this.name +" "+this.name2;
		 
	 }
	 public int hashCode() {
		 return Objects.hash(id,name,name2);
	 }
	 public boolean equalas(Object o) {
		 Shop s = (Shop)o;
		 return this.id==s.id && this.name.equals(s.name)&&
					this.name2.equals(s.name);
	 }
	 @Override
	 public int compareTo(Shop o) {
		
		return this.id;
	 }
	
}
