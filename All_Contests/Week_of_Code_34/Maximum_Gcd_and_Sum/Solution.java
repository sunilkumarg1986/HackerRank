/*
You are given two arrays A and  B containing  elements each. Choose a pair of elements(x,y)  such that:

 x belongs to array  A.
y  belongs to array  B.
 gcd(x,y) is the maximum of all pairs .
If there is more than one such pair(x,y)  having maximum gcd, then choose the one with maximum sum. Print the sum of elements of this maximum-sum pair.

NOTE: gcd(x,y)  returns the largest integer that divides both x and y .

Input Format

The first line of the input contains  denoting the total number of elements of arrays A and B. 
Next line contains n space separated positive integers denoting the elements of array A. 
Next line contains n space separated positive integers denoting the elements of array  B.
*
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Solution {

    static int maximumGcdAndSum(int[] A, int[] B) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				String s=A[i]+B[j]+","+gcd(A[i],B[j]);
				map.put(s,gcd(A[i],B[j]));
			}
			
		}
		List<Entry<String,Integer>> l=new LinkedList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(l,(Entry<String,Integer> o1,Entry<String,Integer> o2)-> -    o1.getValue().compareTo(o2.getValue()));
		List<Integer> aa=new ArrayList<Integer>();
		
		for(int k=0;k<l.size();k++)
		{
			if(l.get(0).getValue()==l.get(k).getValue())
			{
				String[] str=l.get(k).getKey().split(",");
				aa.add(new Integer(str[0]));
			}
		}
		;
		Collections.sort(aa);
		return(aa.get(aa.size()-1));
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] A = new int[n];
    for(int A_i = 0; A_i < n; A_i++){
        A[A_i] = in.nextInt();
    }
    int[] B = new int[n];
    for(int B_i = 0; B_i < n; B_i++){
        B[B_i] = in.nextInt();
    }
    int res = maximumGcdAndSum(A, B);
    System.out.println(res);
    }
    public static int gcd(int a, int b)
	{
		if(a==0 || b==0){
			return 0;
		}
		
		if(a==b){
			return a;
		}
		if(a>b)
		{
			return gcd(a-b,b);
		}
		else
		{
			return gcd(a,b-a);
		}
	}
}


