package Synchronition;

public class Third {

	public static void main(String[] args) throws InterruptedException {
          Moon m = new Moon();
          
          sun s = new sun(m);
          nun n = new nun(m);
          
          s.start();
          n.start();
          
          Thread.sleep(2000);
          System.out.println(m.count);
	}

}
 class Moon{
	 int count =0;
	 
	 public void incress() {
		  count++;
		  
	 }
	 public int getcount() {
		 
		 return this.count;
	 }
	  
 }
 class sun extends Thread{
	  Moon m;
	 
	 public sun(Moon m) {
		 this.m=m;
	 }
	 public void run() {
		 for(int i=0;i<700;i++)
			 m.incress();
	 }
	 
 }
 class nun extends Thread{
	 Moon m;
	 
	 public nun(Moon m) {
		 this.m=m;
	 }
	 public void run() {
		 for(int i =0;i<900;i++) {
			 m.incress();
		 }
	 }
 }