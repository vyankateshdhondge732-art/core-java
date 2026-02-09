package volatil;

public class first_1 {

	
    static boolean flag=true;
	public static void main(String[] args) throws InterruptedException {
		 Thread t =new Thread (()->{
			 System.out.println("Thread is star::");
			 while(flag) {
				 //System.out.println("==============");
			 }
			 System.out.println("Thread is stop");
		 });
		
		 t.start();
		 Thread.sleep(3000);
		 System.out.println("setting flag to false");
		 flag=false;
		 System.out.println("flag now Change ::"+flag);
	}

}
