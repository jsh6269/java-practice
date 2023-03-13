package b_Iterator;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ths", "12a", "wea");
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		list = new LinkedList<String>(list);
		System.out.println();
		System.out.println(list);
		list = new ArrayList<String>(list);
		System.out.println(list);
	}
}
