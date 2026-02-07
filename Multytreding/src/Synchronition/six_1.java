package Synchronition;

import java.util.ArrayList;
import java.util.List;

public class six_1 {

	public static void main(String[] args) {
				Res res = new Res();
				
				ThreadOne t1 = new ThreadOne(res);
				ThreadTwo t2 = new ThreadTwo(res);
				
				t1.start();
				t2.start();

			}

		}

		class Res
		{
			List<Integer> list = new ArrayList <Integer> ();
			
			public synchronized void addNumber() throws InterruptedException
			{
				
				if(list.size()<=10)
				{
					list.add(1);
					System.out.println("Number added ...");
				}
				
				if(list.size()==10)
				{
					System.out.println("Memory full, waiting....");
					wait();
				}
				notify();
				
				
			}
			
			public synchronized void removeNumber() throws InterruptedException
			{
				
					
				if(list.size()==10)
				{
					
					System.out.println("Deleting elements from the memory....");
					
					for(int i=0; i<list.size(); i++)
					{
					list.remove(i);
					}
					
					System.out.println("Elements removed....");
					
				}
				
				if(list.size()==0)
				{
					System.out.println("Empty memory, Please add numbers....");
					wait();
				}
				notify();
				
				
			}
		}

			

		class ThreadOne extends Thread
		{
			Res res;
			
			public ThreadOne(Res res)
			{
				this.res=res;
			}
			
			public void run()
			{
				while(true)
				{
					
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						res.addNumber();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		class ThreadTwo extends Thread
		{
			Res res;
			
			public ThreadTwo(Res res)
			{
				this.res=res;
			}
			
			public void run()
			{
				while(true)
				{
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					try {
						res.removeNumber();
					} catch (InterruptedException e) {
					}
				}
				
			}
		
	}


