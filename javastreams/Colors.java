package javaassignments;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Colors {



		public static void main(String[] args) {
			
			List<Fruits> fruitslist =Arrays.asList
			(new Fruits("Mango",105, 90,"Yellow"),
			new Fruits("Apple", 95, 30, "Red"),
		    new Fruits("Strawberry", 25, 10,"Red"),
			new Fruits("Cherry", 101, 10, "Red"),
			new Fruits("Grapes", 15, 20, "Green"));
			
			
			fruitslist.forEach(System.out::println);
			System.out.println("--------------------------");
			System.out.println("Question 1");
			fruitslist.stream().filter(t->t.getCalories()<100)
			.sorted(Comparator.comparingInt(Fruits::getCalories).reversed()).collect(Collectors.toList())
			.forEach(System.out::println);
			
			
			
			
			
			
			
			System.out.println("----------------------------------------");
			System.out.println();
			fruitslist.stream()
					.filter(t->t.getColor()=="Red")
					.sorted(Comparator.comparingInt(Fruits::getPrice))
					.collect(Collectors.toList())
			         .forEach( System.out::println);
		}}