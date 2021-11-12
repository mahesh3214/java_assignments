package javaassignments;

import java.util.ArrayList;

public class Uppercase6 {
	   public static void main(String[] args) throws CloneNotSupportedException {
		      ArrayList<String> list = new ArrayList<>();
		      list.add("Java");
		      list.add("JavaScript");
		      list.add("CoffeeScript");
		      list.add("HBase");
		      list.add("OpenNLP");
		      System.out.println("Contents of the list: "+list);
		      list.replaceAll(new Lambda6());
		      System.out.println("Contents of the list after replace operation: \n"+list);
		   }
		}
