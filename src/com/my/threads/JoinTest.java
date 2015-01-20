package com.my.threads;

public class JoinTest {
    
	public int sharedCounter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinTest app = new JoinTest();
		
		Thread t1 = new Thread(()->app.doWork());
		
		Thread t2 = new Thread(()->app.doWork());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(app.sharedCounter);

	}
	
	
	public void doWork() {
		for (int i=0;i<100000;i++) 
			 increment();
				
	}
	
	public synchronized void increment() {
		sharedCounter++;
	}
	

	
	
}


