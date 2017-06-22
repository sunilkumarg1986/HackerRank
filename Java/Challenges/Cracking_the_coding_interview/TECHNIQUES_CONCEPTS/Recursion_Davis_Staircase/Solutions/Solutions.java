/*
Davis has  staircases in his house and he likes to climb each staircase , , or  steps at a time. 
Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the  staircases in his house, find and print the number of ways he
 can climb each staircase on a new line.

Input Format

The first line contains a single integer, , denoting the number of staircases in his house. 
Each line  of the  subsequent lines contains a single integer, , denoting the height of staircase .

or each staircase, print the number of ways Davis can climb it in a new line.

Sample Input

3
1
3
7
Sample Output

1
4
44
Explanation

Let's calculate the number of ways of climbing the first two of the Davis'  staircases:

The first staircase only has  step, so there is only one way for him to climb it (i.e., by jumping  step). Thus, we print  on a new line.
The second staircase has  steps and he can climb it in any of the four following ways: 
Thus, we print  on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

private static Map<Integer, Integer> map = new HashMap<>();s
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
             System.out.println(jump(n));
	    }
	}
	private static int jump(int n)
	{
		
		if (n<0)
		{
			return 0;
		}
		
		if (n==0)
		{
			return 1;
		}
		if(!map.containsKey(n))
		{
			int count=jump(n-1)+jump(n-2)+jump(n-3);
			map.put(n, count);
		}
		return map.get(n);
	}
}