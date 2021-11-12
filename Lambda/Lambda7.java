package javaassignments;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
public class Lambda7 {
	public static void main(String[] args) {
     Map<Integer , String> map = new LinkedHashMap<>();
     map.put(20, "hiii");
     map.put(15, "world");
     map.put(54, "missed");
	
	StringBuilder result = new StringBuilder();
	map.forEach((k,v)-> result.append(k).append(v));
	System.out.println("result String is : "+result);

}}
