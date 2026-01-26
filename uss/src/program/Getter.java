package program;

public class Getter {
	
	  private int age;
	      

	public int getAge() {
		return age;
	}


	  public void setAge(int age) {
		  this.age = 25;
	  }


	public static void main(String[] args) {

		   Getter g= new Getter();
		   g.setAge(24);
		  System.out.println( g.getAge());
      //   System.out.println(g.getAge()) ;      
	}

}
