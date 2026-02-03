package Synchronition;

public class four {

	public static void main(String[] args) throws InterruptedException {
           om o = new om();
           om o1 = new om();
           
           sani s=new sani(o);
           sami s1 =new sami(o);
           
           Thread.sleep(1500);
           s.start();
           s1.start();
           Thread.sleep(2000);
           System.out.println(o.getcount());
         //  Thread.sleep(1500);
           System.out.println("sync:::"+o1.getcount());
	}

}
class om {
	  int count=0;
	   
	  public void incres() {
		  synchronized (this){
		 this.count++;
		  }
	  }
	  
	  public void decres() {
		  count--;
	  }
	  public int getcount() {
		return this.count;
		  
	  }
}
class sani extends Thread{
	om o;
	
	public sani(om o) {
		this.o=o;
	}
	public void run() {
		for ( int i=0; i<1600;i++)
			o.incres();
	}
}
class sami extends Thread{
	om o;
	public sami(om o) {
		this.o=o;
		
	}
	public void run() {
		for(int i=0;i<1500;i++)
			o.decres();
	}
}
