package javaassignments;
import java.util.Scanner;
public class simplecompound {
	public static void main(String args[]) {
		double principle,time,rate,simple,compound;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle");
		principle=sc.nextDouble();
		System.out.println("enter rate");
		rate=sc.nextDouble();
		System.out.println("enter time");
		time=sc.nextDouble();
		simple=(principle*rate*time)/100;
		compound=principle*Math.pow(1.0+rate/100.0,time)-principle;
		System.out.println("simple interest" +simple);
		System.out.println("compound interest" +compound);		

}}
