package com.test;

import java.util.Dictionary;
import java.util.Hashtable;



public class FibonikiSeries {
	
	public static void main(String[] args) {
		
		Dictionary<String, Integer> d=new Hashtable<String, Integer> ();
		int a=0,b=1,c;
		System.out.print(a +" "+b );
		for(int i=1;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	
		
		
		
		
	}

}
