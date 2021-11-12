package javaassignments;
import java.util.Arrays;
import java.util.ArrayList;

public class Lambda3 {
	
	 public static void main(String[] args) 
	    {
	        ArrayList<String> listOfNames = new ArrayList<String>();
	        listOfNames.add("JAVAE");
	        listOfNames.add("GOAL");
	        listOfNames.add("RAVIS");
	        listOfNames.add("NEWERS");
	        listOfNames.add("WWW");
	        
	        System.out.println("Before removing the Names from list = "+listOfNames);
	                
	        listOfNames.removeIf(name -> (name.length()%2!= 0));
	                
	        System.out.println("After removing the ODD Names from list = "+listOfNames);
	    }
	}
	
	
	
	
	

	
	
	
	 
	
	
	
	
	


