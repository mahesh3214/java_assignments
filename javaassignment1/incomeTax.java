package javaassignments;
import java.util.Scanner;
import java.lang.Math;
public class incomeTax {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter salary");
double salary,tax=0.0;
salary=sc.nextDouble();
if((salary>0) && (salary<=180000)) {
	tax=0.0;
} else if((salary>=181001) && (salary<=300000)) {
	tax=salary*(0.1);
} else if((salary>=300001) && (salary<=500000)) {
	tax=salary*(0.2);
} else if((salary>=500001) && (salary<=1000000)) {
	tax=salary*(0.3);
}
System.out.println("income tax ammount"+tax);
	}

}
