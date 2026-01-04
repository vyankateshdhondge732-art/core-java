package method_overloading;

public class fifth {

	public static void main(String[] args) {
           Demo d1 =new Remove(101,"KJD");
           d1.Add();
}
	

}
class Demo{
	int id ;
	String name;
	
	public Demo (int id,String name ) {
		this.id =id;
		this .name=name;
	}
	public void Add() {
	  System.out.println("demo is print for the parent class");
		  
	  }
	}
 class Remove extends Demo {

	public Remove(int id, String name) {
		super(id, name);
		
	}
	public void Add() {
		System.out.println("jf");
	}
    	 
    	 
 }
 
 
