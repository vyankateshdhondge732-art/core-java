package typesofcopy;

public class first {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		student s=new student(1,"radha");
		   student s2 =(student)s.clone();
    System.out.println(s.id+" = "+s.name);
    System.out.println(s2.id+" "+s.name);
	}

} class student implements Cloneable{     
	int id;
	String name;
	 
	student(int id ,String name){
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {     // shallo copy//
		return super.clone();
		
	}
}
