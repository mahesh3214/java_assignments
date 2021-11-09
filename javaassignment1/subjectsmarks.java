package javaassignments;
import java.util.Scanner;
import java.io.*;
public class subjectsmarks {
	public static void results(int[] a)
	{
		
		if(a[0]>60)
	{
		if(a[1]>60)
		{
		if(a[2]>60)
		{
	System.out.println("passed all subjects");
	}
	else 
	{
		System.out.println("promoted");
		}
	}
	else
	{
		System.out.println("failed");
		}
	} 
	else {System.out.println("failed");}}
	
	public static void main(String ards[]) {
		int i,a,j ,temp=0;
		int[] x =new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three values");
		for(i=0;i<3;i++) {
			x[i]=sc.nextInt();
		}
		for(i=0;i<3;i++) {
			for(j=i+1;j<3;j++) {
				if(x[i]<x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	
	results(x);
}}
