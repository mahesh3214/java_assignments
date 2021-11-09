package javaassignments;
import java.lang.*;
import java.util.Scanner;
public class exception1 {
	
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		double i = sc.nextDouble();
		System.out.println("enter the second number");
		double j = sc.nextDouble();
		try 
		{
			double a = i/j;
			System.out.println(a);
		}
		catch(ArithmeticException E){System.out.println(E);}
		{
			System.out.println("Denominator cannot be zero");
			System.out.println("Re-enter the second number");
			j = sc.nextDouble();
			System.out.println("division is: "+i/j);
		}
		
		
	}
	}
