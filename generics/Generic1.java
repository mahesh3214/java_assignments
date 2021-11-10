package javaassignments;
import java.util.HashSet;

public class Generic1 {
	
	      int id,salary;
	      String emp_name,department;
		public Generic1(int id, int salary, String emp_name, String department) {
			super();
			this.id = id;
			this.salary = salary;
			this.emp_name = emp_name;
			this.department = department;
		}
	      public void display_details()
	      {
	    	  System.out.println("employee id "+id);
	    	  System.out.println("employee salary "+salary);
	    	  System.out.println("employee name "+emp_name);
	    	  System.out.println("employee dept "+department);
	      }    
	}
	