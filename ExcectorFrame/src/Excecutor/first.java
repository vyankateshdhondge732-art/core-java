package Excecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class first {

	public static void main(String[] args) {
             Runnable re=()->{
            	 for(int a=1;a<10;a++) {
            		 try {
						Thread.sleep(1000);
					 } catch (InterruptedException e) {
					 }
            		 System.out.println(a);
            	 }
            	 System.out.println("**********************************");
             };
               Runnable re1 =()->{
            	   for (int i=1;i<100;i++) {
            		   System.out.println(i);
            	   }
            	   System.out.println("***************************************");
               };
             
             ExecutorService ex = Executors.newSingleThreadExecutor();
             ex.execute(re);
             ex.execute(re1);
             ex.shutdown();
	}

}
