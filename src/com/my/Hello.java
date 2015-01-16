package com.my;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("aaaaaa");
		
		(new IEcho() {

			@Override
			public void echo() {
				
				System.out.println("hi");
				
			}
			
		}).echo();
		
	}

}
