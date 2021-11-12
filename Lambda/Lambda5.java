package javaassignments;
import java.util.ArrayList;
import java.util.List;

public class Lambda5 {


    public static void main(String[] args) {
List<String> Names=new ArrayList<>();
        Names.add("Mark");
        Names.add("item");
        Names.add("things");
        Names.add("heart");

StringBuilder result=new StringBuilder();
Names.forEach(s ->result.append(s.charAt(0)));
        System.out.println(result);
    }
}
