package Synchronition;

import java.util.ArrayList;
import java.util.List;


public class eight {

	public static void main(String[] args) throws InterruptedException {
        cod c =new cod ();
        
        vani v =new vani();
        vasu s =new vasu();
        
        v.c=c;
        s.c=c;
        
        Thread.sleep(1500);
        v.start();
        s.start();
	}

} 
class cod {
	
      List<Integer>list=new ArrayList();
	
      int num=0;
      public synchronized void increment() throws InterruptedException {
    	  Thread.sleep(1000);
    	  if(list.size()==10) {
    		  Thread.sleep(1000);
    	  wait();
    	  }
    	  list.add(num);
    	  num++;
   
    	  System.out.println("adding number"+num);
    	
    	  }
      public synchronized void Decrem() throws InterruptedException {
    	  if(list.size()==0) {
    		  Thread.sleep(2500);
    		  wait();
    	  }
    	int removed=  list.remove(0);
    	
    System.out.println("remove elements"+removed);
      }
      }
class vani extends Thread{
	cod c;
	
	public void run() {
		while(true) {
			try {
				c.increment();
			}catch(Exception e) {
				
			}
			
		}
		  
	}
}
class vasu extends Thread{
	cod c;
	 
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				c.Decrem();
			}catch(Exception e){
				
			}
		}
		}


	}


