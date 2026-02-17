package Excecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Third {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
         Runnable run =()->{
        	 for(int a =1;a<10;a++) {
        		 System.out.println(a);
        	 }
         };
         ExecutorService ex =Executors.newSingleThreadExecutor();
         Future<?>f1=ex.submit(run,"defoult value");
         System.out.println(f1.get());
         ex.shutdown();
	}

}
