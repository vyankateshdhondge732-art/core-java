package Refer;

import java.util.List;



public class five {

	public static void main(String[] args) {
		List.of(new Empp(1,"king",100.0),
			       new Empp(2,"sam",200.0),
			       new Empp(3,"madhu",500.0),
			       new Empp(4,"anu",300.0),
		           new Empp(5,"aniu",600.0),
	                new Empp(6,"aanu",300.0))

	           .stream()
	           .sorted((i,j)->Double.compare(i.salary, j.salary))
	           .filter(i->i.salary>200&&i.salary<500)
	           .forEach(i->System.out.println(i));
	            
		}

	}

	class Empp {
		int id;
		String name;
		Double salary;

		public Empp(int id, String name, Double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public String toString() {
			return this.id + "" + this.name + "" + this.salary;


	}

}
