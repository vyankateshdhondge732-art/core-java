package Threde;

public class Third {

	public static void main(String[] args) {
           Thread t1 =new Thread(()->{
        	   for(int i=0;i<15;i++) {
        		   System.out.println(i);
        		   
        	   }
           });
                t1.start();
                
                
                Thread t2 =new Thread(()->{
                	for (int i=0;i<30;i++) {
                		System.out.println(i);
                	}
                });
                t2.start();
	}

}
