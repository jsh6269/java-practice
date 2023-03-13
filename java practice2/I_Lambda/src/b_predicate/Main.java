package b_predicate;
import java.util.*;
import java.util.function.*;
import java.util.Arrays;

public class Main {
	public static int sum(Predicate<Integer> p, List<Integer> lst) {
		int sum = 0;
		for(Integer n : lst) {
			if(p.test(n))
				sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 5, 6, 2);
		int s = 0;
		s = sum(n -> n%2==0, list);
		System.out.println(s);
		s = sum(n -> n%2==1, list);
		System.out.println(s);
	}
}
