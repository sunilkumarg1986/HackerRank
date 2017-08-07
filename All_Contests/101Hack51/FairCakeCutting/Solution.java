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

    static long howManyToInvite(long A, long B, long a) {
        // Return the number of people Leha should invite to his party
        if(B==0)return 1;
        Double n=(double)A/B;
		Double out=(a/n);
        return out.longValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long a = in.nextLong();
        long b = howManyToInvite(A, B, a);
        System.out.println(b);
        in.close();
    }
}

