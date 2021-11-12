package javaassignments;
import java.util.function.Function;
import java.util.function.Supplier;
public class Lambda3function {

	public static void main(String[] args) {
		Function<Integer, String> getInt=t->t*10+" multiplied by 10";
		System.out.println(getInt.apply(3));
		System.out.println("----------------------------- Supplier");
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get());
	}

}
 