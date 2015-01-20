package com.my;

import java.util.Arrays;
import java.util.List;

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
		
		int[] arr = {1,2,3,4};
		
		List<String> list = Arrays.asList("1","2","3","4","5");
	
		list.forEach( s->System.out.println(s));
				
		
	}

}
