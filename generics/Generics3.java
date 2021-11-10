package javaassignments;

public class Generics3 {


		public static void main(String[] args) {
			Integer[] arr = {10,20,30,40,50,60};
			int a=4;
			int b=1;
			
			Changing3<Integer> x = new Changing3<>(arr);
			Integer[] arr2 = x.getArr();
			System.out.println("Swapping at index "+a+ " and "+b);
			System.out.println("--------------before swap-----------");
			x.printElements(arr);
			x.swap(arr,a,b);
			System.out.println("--------------after swap-----------");
			x.printElements(arr);
			

			
		}
	}

