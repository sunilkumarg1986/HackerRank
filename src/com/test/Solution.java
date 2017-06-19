package com.test;

import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        List ll= new LinkedList();
        for(int i=0;i<arr.length;i++)
        {
        	ll.add(arr[i]);
        }
        
        
        
      BigInteger min=new BigInteger("0");
      BigInteger max=new BigInteger("0");
       Collections.sort(ll);
       
       for(int j=0;j<=ll.size()-1-1;j++)
       {
    	   min=min.add(BigInteger.valueOf(((Integer)ll.get(j)).longValue()));
    	   
    	   
       }
       for(int j=ll.size()-1;j>=1;j--)
       {
    	   max= max.add(BigInteger.valueOf(((Integer)ll.get(j)).longValue()));
       }
       
        
        System.out.println(ll);
        System.out.println("Min="+min);
        System.out.println("Max="+max +"round:"+Math.ceil(133/5)*5);
        
       
    }
}