package javaassignments;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Collections1 {

	public static void main(String[] args) {
		Map<Long, Contact> k=new HashMap<>();
		k.put(10012002l,new Contact(99887766, "ramensh","ramesh123@gmail.com",Contact.Gender.male));
		Set<Long> keys=k.keySet();
		for(long i: keys) {
			System.out.print("keys =");
			System.out.println(i);
		}
		for (long i: keys) {
			System.out.print("value =" );
			System.out.println(k.get(i));
		
		}
	 System.out.print("keys and values=");
	System.out.println(k);}

}
