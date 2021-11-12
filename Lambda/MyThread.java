package javaassignments;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyThread extends Thread {
	public void run() {
		System.out.println(MyThread.currentThread());
 		List<Integer> values=Arrays.asList(12,4,27,78,545,66,24);
 		values.forEach(i-> System.out.println(i));
			}

		}