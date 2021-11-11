package javaassignments;
import java.util.Comparator;
public class Id implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
