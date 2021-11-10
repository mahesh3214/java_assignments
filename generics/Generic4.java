package javaassignments;
import java.util.*;
public class Generic4 {
	
	      public static void main(String[] args) {
			
	    	  
	    	  PairKeyValue<String, String> myobj=new PairKeyValue<String, String>("1","Hello");
	          System.out.println(" { "+myobj.getKey()+" = "+myobj.getValue()+" } ");
	          
	          Date objc=new Date();
	          PairKeyValue<String, java.util.Date> object=new PairKeyValue<String,java.util.Date> ("1",objc);
	          System.out.println(" { "+object.getKey()+" = "+object.getValue()+" } ");
		}
	}
