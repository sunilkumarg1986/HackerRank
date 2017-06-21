/*
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other 
if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters 
in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions 
required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  
and  anagrams. Any characters can be deleted from either of the strings.

Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4
Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete  characters to make both strings anagrams, so we print  on a new line.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      HashMap<Character,Integer>m=new HashMap<Character,Integer>();
	        
	        for(char c:first.toCharArray())
	        {
	        	if(m.containsKey(c))
	        	{
	        		//int v=m.get(c)+1;
	        		m.put(c, m.get(c)+1);
	        	}
	        	else
	        	{
	        		m.put(c, 1);
	        	}
                
	        }
	        for(char c:second.toCharArray())
	        {
	        	if(m.containsKey(c))
	        	{
	        		//int v=m.get(c)-1;
	        		m.put(c, m.get(c)-1);
	        	}
	        	else
	        	{
	        		m.put(c, -1);
	        	}
	        }
	        
	       Collection<Integer> i=m.values();
	       int result=0;
	       for(int c:i)
	       {
	    	   result+=Math.abs(c);
	       }
	       return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

