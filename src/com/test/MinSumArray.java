package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class MinSumArray {

    static int twinArrays(int[] ar1, int[] ar2){
    	List<Integer> a1= new ArrayList<Integer>();
    	List<Integer> a2= new ArrayList<Integer>();
    	for(int i=0;i<ar1.length;i++)
    	{
    		a1.add(ar1[i]);
    	}
    	
    	for(int i=0;i<ar2.length;i++)
    	{
    		a2.add(ar1[i]);
    	}
    	Collections.sort(a1);
    	Collections.sort(a1,new Comparator<Integer>()
    			{
					@Override
					public int compare(Integer o1, Integer o2) {
						return -o1.compareTo(o2);
					}
    			});
    	System.out.println("a1 : "+a1 +"a2: "+a2);
    	return (a1.get(0)+a2.get(a2.size()-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
