package javaassignments;
@FunctionalInterface
interface Arithmetic{
	
	int operations(int a ,int b);
}
public class Lambda1 {

	public static void main(String[] args) {
		
		Arithmetic addition=(a,b)->(a+b);
		System.out.println("addition "+addition.operations(10,20));
		Arithmetic sub=(a,b)->(a-b);
		System.out.println("substraction "+sub.operations(80,20));
		Arithmetic mul=(a,b)->(a*b);
		System.out.println("multiplication "+mul.operations(20,5));
		Arithmetic div=(a,b)->(a/b);
		System.out.println("division "+div.operations(15,3));
	}
	
	
	
	
	
	
	
	
	
	
}
