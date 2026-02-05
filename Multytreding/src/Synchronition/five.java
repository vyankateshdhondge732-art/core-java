package Synchronition;

public class five {

	public static void main(String[] args) throws InterruptedException {
        madhu a =new madhu();
          
        nana n = new nana(a);
        mama  n1=  new mama(a);
        
        n.start();              /// class synchronized
        n1.start();
        Thread.sleep(1000);
        System.out.println(a.getcount() );
	}

} class madhu {
	int count =0;
	public  void incre() {
		synchronized(this) {
			count++;
		}
		
	}
	public int getcount() {
		return count;
	}
}
class nana extends Thread{
	madhu m;
	 
	public nana(madhu m) {
		this.m=m;
	}
	public void run () {
		for (int i =0;i<10001;i++)
			m.incre();
	}
}class mama extends Thread{
	madhu m;
	 
	public mama(madhu m) {
		this.m=m;
	}
	public void run () {
		for (int i =0;i<1000;i++)
			m.incre();
	}
}
