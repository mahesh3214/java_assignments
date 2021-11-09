package javaassignments;
import java.io.*;

import java.util.*;

import java.lang.Math;

public class bubblesort {
	
	static void bubbleSort(int a[],int key)
		
	{
			
	int i,j,temp;
			
	boolean found=false;
			
	for(i=0;i<9;i++)
			
	{
				
	for(j=0;j<(9-i);j++)
				
	{
					
	if(a[j] > a[j+1])
					
	{
						
	temp=a[j];
						
	a[j]=a[j+1];
						
	a[j+1]=temp;
					
	}
					
				
	}
			
	}
			
	for(i=0;i<9;i++)
			
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

		
		
	public static void main(String[] args)
		
	{
			
	Scanner sc=new Scanner(System.in);
			
	int a[]=new int[10];
			
	int i,key;
			
	System.out.println("Enter 10 elements in the array: ");
			
	for(i=0;i<9;i++)  
			
	{
				
	a[i]=sc.nextInt();
	
	}
	
	System.out.println("Enter the element to be searched: ");
			
	key=sc.nextInt();
			
	bubbleSort(a,key);
	System.out.println("Array After Bubble Sort");  
    for(i=0; i < 9; i++){  
            System.out.print(a[i] + " ");  
		
	}

	}}

