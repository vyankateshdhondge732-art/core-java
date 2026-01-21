package api;

import java.util.List;

public class Bifunction1 {

	public static void main(String[] args) {
             
	List<Sani> li=	List.of(new Sani(78,"abc",759.0),
		        new Sani(34,"hi",7483.0),
		        new Sani(70,"love",676.0));
	Double totalSalary=	li.stream()
		.mapToDouble(Sani->Sani.salary)
		.reduce(0.0,(a,b)->a+b);
		//.reduce("",(a,b)->a.salary+b.salary));
//		.sorted((i,j)->Integer.compare(i.id, i.id))
//		.forEach(i->System.out.println(i));
//		System.out.println(totalSalary);
			       	}

} 
class Sani{
	  int id;
	  String name;
	  Double salary;

	 public Sani(int id ,String name,Double salary) {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }

    public String toString() {
	    return name;
}
    
}
