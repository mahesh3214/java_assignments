package javaassignments;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Consumer;
class Person{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name=name;
	}
}
public class Lambd3 {
	

	public static void main(String[] args) {
		Predicate<String> checking=str->str.length()>5;
		System.out.println(checking.test("Predicate=>lambdaking"));

		Person p=new Person();
		Consumer<Person>setName=t->t.setName(" consumer =>park");
		setName.accept(p);
		System.out.println(p.getName());
	
	
	
	}
	

}
