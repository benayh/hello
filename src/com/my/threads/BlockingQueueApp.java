package com.my.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueApp {

	
	static BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(10);

	
	static void producer()  {
		
		Random r = new Random();
		
		while (true)
			try {
				//System.out.println("producer");
				q.put(r.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
static void consumer()  {
		
		Random r = new Random();
		
		while (true)
			try {
				
				//System.out.println("consumer");
				Thread.sleep(100);
		   
		
			if (r.nextInt(10) == 0) {
				Integer i = null;
				try {
					i = q.take();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("taken : " + i + "  size:" + q.size());
			}
			
			} catch (InterruptedException e1) {
			}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()-> producer());
		Thread t2 = new Thread(()-> consumer());
		
		t1.start();
		t2.start();
		
		System.out.println("baþladý");
		
	//	t1.join();
	//	t2.join();
		

	}

}
