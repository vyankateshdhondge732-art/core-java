package api;

import java.util.List;

public class byoperator {

	public static void main(String[] args) {
         
		List.of(new Employee(1,"abc",98790.0),
		        new Employee(2,"efg",876.0),
                 new Employee(3,"jk",653.0),
                 new Employee(4,"jdfh",4623.0))
             .stream()
             .sorted((i,j)->Double.compare(i.Salary, j.Salary))
             .filter(i-> i.Salary>100 && i.Salary<5000)
             .limit(2)
             .skip(1)
             
             .forEach(i->System.out.println(i));
	}

}
class Employee{
	int id;
	String name;
	Double Salary;
	
	public Employee(int id ,String name ,Double Salary) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		
	}
	
	public String toString() {
		return this.id+" "+ this.name+" "+this.Salary;
	}
	
}
