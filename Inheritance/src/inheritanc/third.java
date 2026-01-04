package inheritanc;

public class third {

	public static void main(String[] args) {
		
		//Second s1 = new Second();
         Second s2 = new Second(101 ,"RAm","Mumbai",102,"Sham","Pune");
         s2.print();

         s2.pp();
        	}
	}
class Fourth{
	int id;
	String name;
	String city;
	
	public Fourth() {
		System.out.println("heloo");
	}
	public Fourth(int id,String name ,String city ) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public void print() {
		System .out.println("id: "+id+" "+"name :"+name+"city : "+city);
}

}

class Second extends Fourth{
	int id1 ; 
	String name1;
	String city1;
	
	public Second(int id1,String name1,String city1,int id,String name,String city) {
		super(id,name,city);
		this.id1=id1;
		this.name1=name1;
		this.city1=city1;
		
	}

public void pp() {
	System .out.println("id1 "+id1 + "name1 " + " "+name1 +"city1 : "+city1);

}
} 

