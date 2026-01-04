package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class second1 {

	public static void main(String[] args) {
           Student1 st = new Student1(12,"Amar","latur",88.80);
           Student1 st1 = new Student1(12,"Amar","latur",88.80);
           Student1 st2 = new Student1(14,"Amar","latur",88.80);
           Student1 st3= new Student1(15,"Amar","latur",88.80);
           Student1 st4= new Student1(13,"Amar","latur",88.80);
           Student1 st5 = new Student1(15,"Amar","latur",88.80);
           Student1 st6 = new Student1(19,"Amar","latur",88.80);
           
           System.out.println(st.hashCode());
           System.out.println(st.hashCode());
           System.out.println(st.hashCode());
           System.out.println(st.hashCode());
           System.out.println(st.hashCode());
           System.out.println(st.equals(st5));
           
           System.out.println("============");
           Set<Student1> set= new HashSet<>();
           
           set.add(st6);
           set.add(st1);
           set.add(st3);
           set.add(st4);
           set.add(st5);
           set.add(st6);
           System.out.println(set);
           System.out.println("=======");
           
           Iterator<Student1> it = set.iterator();
           while(it.hasNext()) {
        	   System.out.println(it.next());
           }

	}

}
class Student1{
	int id ;
	String name;
	String city;
	double marks;
	
	public   Student1(int id ,String name,String city,double marks) {
		this .id =id;
		this.name=name;
		this.city=city;
		this.marks=marks;
	}
	public String toString() {
		return this.id+ ""+this.name+this.city+this.marks;
	}
	public int hashCode() {
		return Objects.hash(id,name,city,marks);
		
	}
	public boolean equals(Object obj) {
		Student1 st =(Student1)obj;
		return this.id==st.id && this.name.equals(st.name)&& this.city.equals(st.city)&&this.marks == st.marks;
	}
	
	}
