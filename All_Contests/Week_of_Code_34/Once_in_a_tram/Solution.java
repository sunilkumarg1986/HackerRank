/*
One day, Jack was going home by tram. When he got his ticket, he noticed that number on the ticket was not lucky. 
A lucky ticket is a six-digit number on the ticket in which sum of the first three digits is equal to the sum of 
the last three digits.

For example, number 165912 is lucky because sum of , and .

Since the number on the ticket wasn't lucky, Jack needs your help to find the next lucky ticket number.

For example, if Jack's ticket number is 165901, then the next lucky ticket number is 165903.

Given Jack's current ticket number, find and print the next lucky ticket number.

Input Format

The first line contains an integer,6- digit , denoting the  number on the ticket.

Output Format

For the given input find and print the next lucky ticket number.

Sample Input 0

555555
Sample Output 0

555564
*
*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String onceInATram(int x) {
       String output="";
        for(int i=x;i<1000000;i++)
        {
        	String num=i+"";
        	int sum1=0,sum2=0;
        	for(int y=0;y<3;y++)
        	{
        		sum1+=Integer.parseInt(num.charAt(y)+"");
        		sum2+=Integer.parseInt(num.charAt(5-y)+"");
        		
        	}
        	if(sum1==sum2 && !(x==i))
        	{
        		output=num;
        		break;
        	}
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
