package Threde;

public class second {

	public static void main(String[] args) {
        Toni t = new Toni();
        Thread t1 =new Thread(t);
        
        t1.start();
        
        int count=0;
		while(count<15) {
			System.out.println(count);
			count++;
        	
        }
	}

}
class Toni implements Runnable{

	@Override
	public void run() {
         for(int i=0;i<15;i++) {
        	 System.out.println(i);
         }
	}
	
}
