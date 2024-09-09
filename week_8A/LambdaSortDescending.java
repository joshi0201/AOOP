package eightA;
import java.util.ArrayList;
import java.util.List;

public class LambdaSortDescending{

	    public static void main(String[] args) {
	        List<String> colorList = new ArrayList<>();
	        colorList.add("Red");
	        colorList.add("Blue");
	        colorList.add("Green");
	        colorList.add("Yellow");

	        // Sorting in descending order using a lambda expression
	        colorList.sort((col1, col2) -> col2.compareTo(col1));

	        // Printing the sorted list
	        System.out.println("Sorted color list in descending order:");
	        colorList.forEach(System.out::println);
	    }
	}
