package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortLargeNumberAsString {
	public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        int n = in.nextInt();*/
        String[] unsorted = {"6","31415926535897932384626433832795","1","3","10","3","5"};//new String[n];
       /* for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }*/
        
      
        
        Arrays.sort(unsorted,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Double.valueOf(o1).compareTo(Double.valueOf(o2));
			}
		});
        
        for(int i=0;i<unsorted.length;i++)
        {
        		System.out.println(unsorted[i]);
        }
    }
}
