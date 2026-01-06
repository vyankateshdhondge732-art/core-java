package Object1;

public class second {

	public static void main(String[] args) {
     //  Car c =new Car(9589,"Switft","desier");
       Car c1 =new Car(6589,"switft","desier");
       Car c2 =new Car(8589,"switft","desier");
     
       
   //    System.out.println(c.hashCode());
       System.out.println(c1.hashCode());
       System.out.println(c2.equals(c2));

	}

}
class Car{
	  int price ;
	  String name;
	  String name1;
	  
	  public Car(int price,String name,String name1) {
		  this.price=price;
		  this.name=name;
		  this.name1=name1;
		  
	  }
	  public String toString() {
		return this.price+this.name+this.name1;
		  
	  }
	  public int Hashcod() {
		  return this.price;
	  }
	  public boolean equales(Object o){
		 Car c = (Car)o;
		 return this.price==c.price&&this.name .equals(c.name)&&this.equales(c.name1);
		  
	  }
	  
	  
}
