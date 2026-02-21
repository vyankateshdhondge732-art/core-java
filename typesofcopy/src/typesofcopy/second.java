package typesofcopy;

public class second {

	public static void main(String[] args) {
           System.out.println("mn");
	}

}   class emp1{
	int id;
	String name;
	 emp e;
}







class emp implements Cloneable{
	   int id ;
	   String name;
	    
	   emp(int id,String name){
		   this.id=id;
		   this.name=name;
		   
	   }
	   public Object clone() throws CloneNotSupportedException {
		return super.clone();
		   
	   }
}