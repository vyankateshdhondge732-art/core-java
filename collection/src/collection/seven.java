package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class seven {


	public static void main(String[] args) {
		
		
      
		TreeSet<Marsh>set=new TreeSet<Marsh>(new Amit());
		
		set.add(new Marsh(1,"veer"));
		set.add(new Marsh(3,"asma"));
		set.add(new Marsh(2,"raj"));
		
		System.out.println(set);
		}

} class Marsh{
	int id;
	String name;
	 
	public Marsh(int id ,String name) {
		this.id=id;
		this.name=name;
		
	}

public String toString() {
	return this.name;
}

}
class Amit implements Comparator<Marsh>{

	@Override
	public int compare(Marsh o1, Marsh o2) {
		return Integer.compare(o2.id, o1.id);
	}
	
}