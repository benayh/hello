package com.my.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable {
    
	private int id=0;
	
	public Processor(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		System.out.println("Start--> " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End--> " + id);
		
	}
	
}

public class ExecutorTest {

	public static void main(String[] args) {
   	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (int i=0; i<5; i++)
			executor.submit(new Processor(i));
		
		executor.shutdown();
		
		System.out.println("All tasks submitted");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}

		
		System.out.println("All tasks COMPLETED!");
		
	}

}
