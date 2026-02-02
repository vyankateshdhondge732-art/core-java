package Threde;



public class First_1 {

	public static void main(String[] args) {
          
		Demo d =  new Demo();
		Demo d1 = new Demo();
		
		d.start();
		d1.start();
		
		int count = 0;
		while(count<10) {
			System.out.println(count);
			count++;
		}
	}

} class Demo extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
			Thread.sleep(2000);
			}
			catch(Exception e){
			}
			{
				
			}
			System.out.println(i);
		}
	}
}
