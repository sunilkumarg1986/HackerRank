package com.test;
/*
Below code is used to compare the list of String as number.
I have used Arrays method to sort the String based on customized comparator interface with custom return values as below 
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSortingUnsorted {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
    Arrays.sort(unsorted,new Comparator<String>()
                {
                    public int compare(String o1,String o2)
                    {
                        //return Double.valueOf(o1).compareTo(Double.valueOf(o2));
                        return compareStringAsNumber(o1,o2);
                    }
                });
        
        for(int i=0; i < unsorted.length; i++){
            System.out.println(unsorted[i]);
        }
    }
    public static int compareStringAsNumber(String s1, String s2)
    {
        if(s1.length()>s2.length()) return 1;
        if(s1.length()<s2.length()) return -1;
        
        for(int j=0; j < s1.length(); j++){
            
             if((int)s1.charAt(j)>(int)s2.charAt(j)) return 1;
        if((int)s1.charAt(j)<(int)s2.charAt(j)) return -1;
        }
        return 0;
    }
}
