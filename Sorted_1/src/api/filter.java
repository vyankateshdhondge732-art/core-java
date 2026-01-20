package api;

import java.util.List;

public class filter {

	public static void main(String[] args) {
         
		List.of(new Emp(1,"king",100.0),
		       new Emp(2,"sam",200.0),
		       new Emp(3,"madhu",500.0),
		       new Emp(4,"anu",300.0),
	           new Emp(5,"aniu",600.0),
                new Emp(6,"aanu",300.0))

           .stream()
           .sorted((i,j)->Double.compare(i.salary, j.salary))
           .filter(i->i.salary>200&&i.salary<500)
           .forEach(i->System.out.println(i));
            
	}

}

class Emp {
	int id;
	String name;
	Double salary;

	public Emp(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return this.id + "" + this.name + "" + this.salary;

	}
}