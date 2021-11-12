package javaassignments;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
 class Lambda6 implements UnaryOperator<String> {
	   public String apply(String str) {
	      return str.toUpperCase();
	   }
	}
	