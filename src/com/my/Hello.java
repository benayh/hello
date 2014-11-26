package com.my;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("aaaaaa");
		
		(new IEcho() {

			@Override
			public void echo() {
				
				System.out.println("hi");
				
			}
			
		}).echo();
		
	}

}
