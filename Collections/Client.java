package javaassignments;
import java.util.Scanner;
import java.util.TreeSet;
public class Client  {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose between following options:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int k=sc.nextInt();
		TreeSet<Employee> emp=null;
		switch(k)
		{
			case 1: emp=new TreeSet<>(new Id());
					break;
			case 2: emp=new TreeSet<>(new Name());
					break;
			case 3:	emp=new TreeSet<>(new Department());
					break;
			case 4: emp=new TreeSet<>(new Salary());
					break;}
		emp.add(new Employee(1010,"raj","soft",25700.00));
		emp.add(new Employee(1021,"jay","hard",10000.00));
		emp.add(new Employee(1001,"kin","waste",265000.00));
		emp.add(new Employee(1045,"rdin","analyst",320000.00));
		emp.add(new Employee(1074,"din","driver",2060.00));
		emp.add( new Employee(1009,"kas","helper",201400.00));
		emp.add(new Employee(1011,"pat","killer",204560.00));
		emp.add(new Employee(1211,"hat","worker",20005.00));
		emp.add(new Employee(1201,"mat","work",2005.00));
		emp.add(new Employee(1040,"ask","walker",2000.00));
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		
	}		
		
		
	}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

