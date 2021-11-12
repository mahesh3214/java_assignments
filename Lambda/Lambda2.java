package javaassignments;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Orders1> orders=Arrays.asList(new Orders1(3455),
					new Orders1(545666),
					new Orders1(50000));
		orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));
			
		
		
		}
	}


	