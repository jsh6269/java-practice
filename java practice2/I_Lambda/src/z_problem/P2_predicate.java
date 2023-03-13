package z_problem;
import java.util.*;
import java.util.function.*;

public class P2_predicate {
	public static void show(Predicate<Integer> p, List<Integer> lst) {
		for(Integer n: lst)
			if(p.test(n))
				System.out.print(n + " ");
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 6, 2, 7);
		show(n->n%2==1, list);
		System.out.println();
		List<Integer> list2 = Arrays.asList(1, -3, 6, -2, 7);
		show(n -> n > 0.0, list2);	
	}
}
