package program2;

import java.util.List;


public class thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D11 s = new D11();
	       int sum =  
			   List.of(5,10,15,12)
	         .stream()
	         .filter(s::Add)
	         
	         .reduce(0,s::cad);
	       // .forEach(s::Sad);
	       System.out.println(sum);
	        
		}

	}
	class D11 {
		 
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


