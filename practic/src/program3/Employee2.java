package program3;

public class Employee2 {
	private int empid;
	private String name;
	private float marks;

	public void setmarks(float marks) {
		this.marks = marks;
	}
	Employee2(int empid, String name, float marks) {
		empid = empid;
		name = name;
		marks = marks;

}
	public void displayRecord() {
		System.out.println("empid =" + empid);
		System.out.println("name =" + name);
		System.out.println("marks =" + marks);

}
	
}

class set{
	public static void main(String[]args) {
		Employee2 e1=new Employee2(234,"sam",36537f);
		e1.setmarks(34567f);

		
		
		
	}


}
	
