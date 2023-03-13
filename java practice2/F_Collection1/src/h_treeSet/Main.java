package h_treeSet;
import java.util.*;

public class Main {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("asdfqwrwe", "awer", "qwrwtr");
//		list = new LinkedList<>(list);
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.sort(list, (p1, p2) -> p1.length() - p2.length());
//		System.out.println(list);
		List<String> list = new LinkedList<>();
		list.add("good");
		list.add("hang");
		list.remove(0);
		list.add("bad");
		Collections.sort(list, (str1, str2) -> str1.length()-str2.length());
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		
	}
}
