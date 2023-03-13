package removeIf;
import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
//		List<Integer> lst = Arrays.asList(1, 2, 3, 4, -2, -1, 2);
//		lst = new ArrayList<>(lst);
//		Predicate<Number> p = s -> s.doubleValue() < 0.0;
//		lst.removeIf(p);
//		System.out.println(lst);
		List<Integer> list = Arrays.asList(3, 5, -2, -1, 7, -9);
		list  = new LinkedList<Integer>(list);
		list.removeIf(n->n<0);
		System.out.println(list);
	}
}
