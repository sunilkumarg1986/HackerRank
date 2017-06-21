/*
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. 
The Player class is provided in the editor below; it has two fields:

A string, .
An integer, .
Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score,
sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface,
 then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

*/

import java.util.Comparator;

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		
		int result=0;
		
		if(o1.score>o2.score)
			result=1;
		else if(o1.score<o2.score)
			result=-1;
		else if(o1.score==o2.score)
			return o1.name.compareTo(o2.name);
		
		return -result;
	}

}


