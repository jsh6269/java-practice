package ex1;
import java.util.*;

public class MyBusinessMan{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Robot", "Car");
		list = new LinkedList<>(list);
		for(String a : list)
			System.out.println(a);
	}
}
