package Synchronition;

public class First {

	public static void main(String[] args) throws InterruptedException {
           Demo_1 d1 = new Demo_1();
           
           one p1 = new one(d1);
           two p2 = new two(d1);
           
           p1.start();
           p2.start();
           Thread.sleep(2500);
           System.out.println(d1.count);
           
	}

}
class Demo_1{
	int count =0;
	
	public void increment() {
		count++;
	}
//	public void Decrement() {
//		count --;
//	}
	public int getcount() {
		return this.count;
	}
}

class one extends Thread{
	Demo_1 d1;
	
	public one(Demo_1 d1) {
		this.d1=d1;
	}
	public  void run() {
		for(int i =0; i<10000; i++) {
			d1.increment();
		}
	}
}

class two extends Thread {
	Demo_1 d1;
	
	public two (Demo_1 d1) {
		this.d1=d1;
	}
	public void run () {
		for(int i =0; i<10000; i++) {
			d1.increment();
		}
	}
}













