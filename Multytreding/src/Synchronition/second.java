package Synchronition;

public class second {

	public static void main(String[] args) throws InterruptedException {
           Car_1 c =new Car_1();
           
           parent p=new parent(c);
           child p1=new child(c);
           
          
           p.start();
           p1.start();
           Thread.sleep(2500);
           System.out.println(c.count);

	}

}
class Car_1{
	  int count=0;
	  
	  public void increment() {
		  count++;
		  
	  }
	  public int getcount() {
		  return this.count;
	  }
}
class parent extends Thread{
	  Car_1 c;
	  
	  public parent (Car_1 c){
		  this.c=c;
		  
	  }
	  public void run() {
		  for(int i =0;i<1000;i++) 
			  c.increment();
		  }
	  }
class child extends Thread{
	Car_1 c;
	
	public child (Car_1 c) {
		this.c=c;
		
	}
	public void run() {
		for(int i =0;i<1000;i++)
			c.increment();
	}
	
	
	
	
}
	

