package base_transition;
import java.util.Arrays;
import java.util.*;
public class Main {
	public static void main(String[] args) {
//		int[] ar1 = {1,2,3,4};
//		int[] ar2 = {1,2,3,4};
//		int[] ar3 = {1,2,3};
//		System.out.println(Arrays.equals(ar1, ar2));
//		System.out.println(Arrays.equals(ar1, ar3));
//		System.out.println(ar1.equals(ar2));
//		System.out.println(ar1.equals(ar3));
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(2);
		Iterator<Integer> itr = list.iterator();
		itr.next();
		itr.remove();
		itr.next();
		itr.remove();
		for(Integer s : list) {
			System.out.println(s);
		}
	}
}
