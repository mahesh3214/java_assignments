package javaassignments;
import java.lang.*;
 class Employee {
	
	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	private String department;
	private double salary;
	public Employee(int Id, String name, String department, double salary ){
	super();
	this.Id=Id;
	this.name= name;
	this.department = department;
	this.salary= salary;

}
	
	public String toString() {
		return "Employee [employeeId=" +Id+ ",employeename =" +name+ ", department= "+ department +", salary= "+salary+"]";
	}
	
	
			
}
		
		
	
	
