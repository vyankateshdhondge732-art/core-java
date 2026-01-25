package program2;

import java.util.List;

import api.Employee;

public class new1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
			List.of(new Employee2(1,"abc",98790.0),
			        new Employee2(2,"efg",876.0),
	                 new Employee2(3,"jk",653.0),
	                 new Employee2(4,"jdfh",4623.0))
	             .stream()
	             .sorted((i,j)->Double.compare(i.Salary, j.Salary))
	             .filter(i-> i.Salary>100 && i.Salary<5000)
	             .limit(2)
	             .skip(1)
	             
	             .forEach(i->System.out.println(i));
		}

	}
	class Employee2{
		int id;
		String name;
		Double Salary;
		
		public Employee2(int id ,String name ,Double Salary) {
			this.id=id;
			this.name=name;
			this.Salary=Salary;
			
		}
		
		public String toString() {
			return this.id+" "+ this.name+" "+this.Salary;
		}
		
	

	}


