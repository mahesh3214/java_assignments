package javaassignments;
import java.io.*;

import java.util.*;

import java.lang.Math;

public class arraysearch {

public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int a[]=new int[10];
		
int i,key;
		
boolean found=false;
		
System.out.println("Enter 10 elements in the array: ");
		
for(i=0;i<10;i++)
		
{
			
a[i]=sc.nextInt();
		
}
		
System.out.println("Enter the element to be searched: ");
		
key=sc.nextInt();
		
for(i=0;i<10;i++)
		
{
			
if(a[i]==key)
			
{
				
found=true;
				
System.out.println("Key " + key + " found in the array");
				
break;
			
}
		
}
		
if(found==false)
		
{
			
System.out.println("Key " + key + " not found in the array");
		
}

	
}

}
