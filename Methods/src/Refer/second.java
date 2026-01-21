package Refer;

import java.util.List;

public class second {

	public static void main(String[] args) {
		
		D s = new D();
       int sum =  
		   List.of(10,30,20,40,50)
         .stream()
         .filter(s::Add)
         
         .reduce(0,s::cad);
       // .forEach(s::Sad);
       System.out.println(sum);
        
	}

}
class D {
	 
	 public  boolean Add(int i){
		 return i<50;
		 
	 }
	 public void Sad(int i) {
		 System.out.println(i);
	 }
	 public int cad(int a,int b) {
		 return a+b;
	 }
}
