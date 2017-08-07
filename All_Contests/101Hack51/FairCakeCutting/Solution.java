/*
Leha is a young man from Belarus. He loves cakes really much. In Leha's country, cakes are always evenly divided between people.

Leha wants to know how many people he should invite to his party if he has a cake whose size is equal to  units and he wants each person to get exactly  A/B units of cake. 
Note that Leha doesn't take a piece for himself; in other words, the cake is only divided among the people he invited to the party.

Input Format

The first line contains three space-separated integers describing the respective values of A,B , and a

Sample Input 0

5 10 1
Sample Output 0

2
Explanation 0

In this sample case A=5,B=10 ,  and a=1. Leha wants each person to get 5/10=0.5 units of cake. He has a cake whose size is  unit, so if he invites  2 people and the cake is distributed evenly among them, each person gets 0.5 units of cake. 
Therefore, the answer is b=2
*/

/*	static int maxScoreOfVincent(int n, String s, String t) {
	    // Complete this function
	    int result = 0;
	    for(int i=0;i<n;i++){
	    if(s.charAt(i)!=t.charAt(i) && s.charAt(i)!='.')  result++;
	    }
	    return result;
	}*/
	
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maxScoreOfVincent(int n, String s, String t) {
        // Complete this function
        char[]v=v=s.toCharArray();
        char[]c=c=t.toCharArray();
        int common=0;
        int countDot=0;
        if((s.length()==n) &&(n==t.length()))
        {
            for(int i=0;i<v.length;i++)
            {
               if(String.valueOf(v[i]).equals("."))
               {
            	   countDot++;
               }
            	if(v[i]==c[i])
                {
                    if(String.valueOf(v[i]).equals(".") && String.valueOf(c[i]).equals("."))
                    {
                    }
                    else
                    {
                        common++;
                    }
                }
            }    
        }
        return v.length-common-countDot;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the maximum score of Vincent.
        int n = in.nextInt();
        String s = in.next();
        String t = in.next();
        int result = maxScoreOfVincent(n, s, t);
        System.out.println(result);
    }
}
