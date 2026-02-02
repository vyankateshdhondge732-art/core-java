package Threde;

public class four {

	public static void main(String[] args) {
	     Toni1 t = new Toni1();
	        Thread t1 =new Thread(t);
	        
	        t1.start();
	        
	        int count=0;
			while(count<20) {
				System.out.println(count);
				count++;
	        	
				        }
			
		}

	}
	class Toni1 implements Runnable{

		@Override
		public void run() {
	         for(int i=0;i<10;i++) {
	        	 try {
					Thread.sleep(2000);
				 } catch (Exception e) {
									 }
	        	 System.out.println(i);
	         }
		}
		
	

		
	}


