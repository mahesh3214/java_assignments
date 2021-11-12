package javaassignments;

import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence() default 0;
	
}

public class Annotation3 {


	public static void main(String[] args) {
		/*testing t=new testing(pin,56);
		Class c=t.getClass();
		Annotation a=c.getAnnotation(Execute.class);
		Execute b=(Execute)a;
		System.out.println(b.sequence());*/
		
		
	}
	
	class testing{
		private int pin;
		public testing(int pin)
		{this.pin=pin;
		
		}
		@Execute(sequence=1)
		public static void run2()
		
		{
			System.out.println("hiii");
		}
		@Execute(sequence=2)
		public static void run1() {
			System.out.println("world");
	}
	
	
	
}}
