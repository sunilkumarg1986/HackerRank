package com.test;

import java.util.Scanner;

public class StringOddEvenChar {

	public static void main(String a[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		StringOddEvenChar aa=new StringOddEvenChar();
		
		Class zz=Class.forName("com.test.StringOddEvenChar");
		
		StringOddEvenChar StringOddEvenChar1=(StringOddEvenChar) zz.newInstance();
		
		//String s="sunilkumar";
		Scanner sc=new Scanner(System.in);
		int run=sc.nextInt();
		String totalString[]=new String[run];
		for(int i=0;i<run;i++)
		{
			totalString[i]=sc.next();
		}
		
		for(int loop=0;loop<totalString.length;loop++)
		{
			String odd="";
			String even="";
			for(int i=0;i<totalString[loop].length();i++)
			{
				if((i%2)==0)
				{
					even+=totalString[loop].charAt(i);
				}
				else
				{
					odd+=totalString[loop].charAt(i);
				}
			}
			System.out.println(even+"  "+odd);
		}
				
	}
}
