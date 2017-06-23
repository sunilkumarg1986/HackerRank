/*
Consider an array of  integers, , where all but one of the integers occur in pairs. In other words, every element in  occurs exactly twice except for one unique element.

Given , find and print the unique element.

Input Format

The first line contains a single integer, , denoting the number of integers in the array. 
The second line contains  space-separated integers describing the respective values in A.

ample Input 0

1
1
Sample Output 0

1
Explanation 0 
The array only contains a single , so we print  as our answer.

Sample Input 1

3
1 1 2
Sample Output 1

2
Explanation 1 
We have two 's and one . We print , because that's the only unique element in the array.

Sample Input 2

5
0 0 1 2 1
Sample Output 2

2
Explanation 2 
We have two 's, two 's, and one . We print , because that's the only unique element in the array
*/
// This can Alos be done using XOR, as XOR of two similar number returns 0, as in this question we have one unique number so we doo the XOR of all number we will
//we the unique number check below commented code.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int lonelyInteger(int[] a) {

        List<String> l=new ArrayList<String>();
       /* int j=0;
        
        for(int i:a)
        {
            j^=i;
        }
        return j;
        */
	for(int i:a)
	{
		if(l.contains(i+""))
		{
			l.remove(i+"");
		}
		else
		{
			l.add(i+"");
		}
	}
	String result=l.get(0);
	return Integer.parseInt(result);
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
