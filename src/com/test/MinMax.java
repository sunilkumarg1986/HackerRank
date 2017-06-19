package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MinMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        
        for(int i=0;i<height.length;i++)
         {
           if(map.containsKey(height[i]))
           {
        	   map.put(height[i], map.get(height[i])+1);
           }
           else
           {
        	   map.put(height[i], 1); 
           }
        }
        List<Entry<Integer,Integer>> ll=new LinkedList<Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(ll,new Comparator<Entry<Integer,Integer>>() {
		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			return -o1.getValue().compareTo(o2.getValue());	}
	});

        System.out.println(ll.get(0).getKey());
        
    }
}
