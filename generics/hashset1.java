package javaassignments;

import java.util.HashSet;

public class hashset1 {

	public static void main(String[] args) 
	{
		HashSet<Generic1> set = new HashSet<>();
		Generic1 e1 = new Generic1(2445,20000,"mahesh","software");
		set.add(e1);
		for(Generic1 e:set){  
		    e.display_details();
		    }  
	}
}

