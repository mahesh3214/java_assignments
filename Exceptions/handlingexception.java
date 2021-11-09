package javaassignments;
import java.util.Scanner;
public class handlingexception {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		try {
			
		
		double c=divide(a,b);
		System.out.println(c);}
		catch(UnsupportedOperationException e) {
			System.out.println("cant divide by zero");}
		}
	public static double divide(int a,int b) throws UnsupportedOperationException{
		if(b==0) {
			throw new UnsupportedOperationException("Exception");
		}
	return a/b;	}
	
	}
			 