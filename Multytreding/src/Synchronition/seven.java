package Synchronition;

import java.util.ArrayList;
import java.util.List;

public class seven {

	public static void main(String[] args) {
		Source s = new Source();
		
		Firstt f1 = new Firstt();
		Second s2 = new Second();
		
		f1.s = s;
		s2.s = s;
		
		f1.start();
		s2.start();
	}

}

class Source{
	List<Integer> list =new  ArrayList<Integer>();
	int num =0;
	
	public synchronized void Increment() throws InterruptedException {
		Thread.sleep(1000);
		if(list.size()==10) {
			Thread.sleep(1000);
			wait();
		}
		System.out.println("add number::");
		list.add(num);
		notify();
		num++;
		System.out.println("Adding number::=>"+num);

	}
	public synchronized void Dcrement() throws InterruptedException {
		if(list.size()==0) {
			Thread.sleep(1500);
			wait();
			System.out.println("nothing to print::");
		}
		int removed=list.remove(0);
		notify();
		System.out.println("remove element::"+removed);
	}
}

class Firstt extends Thread{
	Source s;
	
	public void run() {
		while(true) {
		try {
			s.Increment();
		} catch (InterruptedException e) {
					}
		}
	}
}
class Second extends Thread{
	Source s;
	public void run(){
		while(true) {
		try {
			Thread.sleep(10000);
			s.Dcrement();
		} catch (InterruptedException e) {
		
		}
	}
	}
}