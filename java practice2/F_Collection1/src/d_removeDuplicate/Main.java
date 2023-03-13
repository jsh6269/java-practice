package d_removeDuplicate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
		System.out.println(list);
		Set<String> set = new HashSet(list);
		List<String> list2 = new LinkedList(set);
		System.out.println(list2);
	}
}
