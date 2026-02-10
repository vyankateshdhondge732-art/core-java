package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {

	public static void main(String[] args) {
       Runnable r1 =()->{
    	   try {
    		   
    	   }catch(Exception e) {
    		   
    	   }
    	   System.out.println("First");
       };
       
       Runnable r2 =()->{
    	   try {
    		   Thread.sleep(1000);           //try cathc block ne prigram terminet hoto 
    	   }catch(Exception e) {
    		   
    	   }
    	   System.out.println("second");
       };
       
       Runnable r3 = ()->{
    	   try {
    		   
    	   }catch(Exception e) {
    		   
    	   }
    	   System.out.println("Third");
       };
       
       Runnable r4 =()->{
    	   try {
    		   
    	   }catch(Exception e) {
    		   
    	   }
    	   System.out.println("four");
       };
       
      try( ExecutorService ex = Executors.newFixedThreadPool(2);)
      {
    	  ex.execute(r1);
          ex.execute(r4);
          ex.execute(r2);
          ex.execute(r3);
      }
    	 catch(Exception e) {
    		  System.out.println(e.getMessage());
    	  }
      }
       
       
	}


