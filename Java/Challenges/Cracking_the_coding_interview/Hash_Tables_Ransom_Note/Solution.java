/*
Question:
A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to 
know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. 
The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot
 use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note 
exactly using whole words from the magazine; otherwise, print No.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) 
sand  (the number of words in the ransom note). 
The second line contains  space-separated strings denoting the words present in the magazine. 
The third line contains  space-separated strings denoting the words present in the ransom note.

Constraints

.
Each word consists of English alphabetic letters (i.e.,  to  and  to ).
The words in the note and magazine are case-sensitive.

Solution:

Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.

Sample Input 0

6 4
give me one grand today night
give one grand today
Sample Output 0

Yes
Sample Input 1

6 5
two times three is not four
two times two is four
Sample Output 1

No
Explanation 1
Two should occure 2 times in magzine.


*/

import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        String[]magz=magazine.split(" ");
    	String[]notes=note.split(" ");
    	
    	magazineMap=new Hashtable<String, Integer>();
        noteMap=new Hashtable<String, Integer>();
    	
    	for(String s:magz)
    	{
    		if(magazineMap.containsKey(s))
    		{
    			magazineMap.put(s, magazineMap.get(s)+1);
    		}
    		else
    		{
    			magazineMap.put(s, 1);
    		}
    	}
    	for(String s:notes)
    	{
    		if(noteMap.containsKey(s))
    		{
    			noteMap.put(s, noteMap.get(s)+1);
    		}
    		else
    		{
    			noteMap.put(s, 1);
    		}
    	}
    }
    
    public boolean solve() {
        Set<String> key=noteMap.keySet();
    	boolean b=false;
    	for(String s:key)
    	{
    		if(magazineMap.containsKey(s))
    		{
    			int magCount=magazineMap.get(s);
    			int notesCount=noteMap.get(s);
    			if(magCount>=notesCount)
    			{
    				b=true;
    			}
    			if(magCount<notesCount)
    			{
    				b=false;
    				break;
    			}
    		}
    	}
    	return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}


