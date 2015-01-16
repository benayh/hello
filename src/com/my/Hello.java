package com.my;

import com.my.IEcho;

public class Hello {

	public static void main(String[] args) {
				
		(new IEcho() {

			@Override
			public void echo(String s) {
				
				System.out.println(s);
				
			}
			
		}).echo("Selam !");
	
		
		
		IEcho j8 =  (s) -> System.out.println(">> " + s );
		
		j8.echo("I am java8");
		
	}

}
