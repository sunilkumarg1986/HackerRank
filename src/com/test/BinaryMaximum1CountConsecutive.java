package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryMaximum1CountConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=439;
//439
		String s = "";
		
		while(i>0)
		{
			s+=i%2;//0001
			i=i/2;
		}
		System.out.println(new StringBuffer(s).reverse());
		String sb=new StringBuffer(s).reverse().toString();
		String []ar=sb.split("0");
		List<Integer> l=new ArrayList<Integer>();
		for(int j=0;j<ar.length;j++)
		{
			l.add(ar[j].length());
		}
		Collections.sort(l);
		
		System.out.println(l.get(l.size()-1));
	}

}
