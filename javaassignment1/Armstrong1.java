package javaassignments;
import java.util.*;

import java.lang.Math;

public class Armstrong1 {

static void checkArmstrong(int n)
	
{
		
int count=0,rem=0,temp=n;
		
int sum=0;
		
while(temp!=0)
		
{			
temp=temp/10;
			
count=count+1;
		
}
		
System.out.println("Number of digits is "+count);
		
temp=n;
		
while(temp!=0)
		
{
			
rem=temp%10;
			
sum= sum + (rem*rem*rem);
			
temp=temp/10;
		
}
		
if(sum==n)
		
{
			
System.out.println("Given number " + n + " is an armstrong number");
		
}
		
else
		
{
			
System.out.println("Given number " + n + " is not an armstrong number");
		
}	
	
}
	
public static void main(String[] args) 
{
		
Scanner sc=new Scanner(System.in);
		
System.out.println("Enter a number:");
		 
int a=sc.nextInt();
		 
System.out.println("Entered number:"+a);
		 
checkArmstrong(a);
	
}

}