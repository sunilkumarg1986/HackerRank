package com.test;

public class FactorialRecursive {

	public static int fact(int a)
	{
		if(a<=0)
		{
			return 1;
		}
		else
		{
			return a*fact(a-1);
		}
	}
	public static void main(String[] args) {

		System.out.println(fact(5));
	}

}
