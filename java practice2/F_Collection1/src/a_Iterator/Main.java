package a_Iterator;
import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		System.out.println(list);
		list.removeIf(str -> str.equals("Toy"));
		System.out.println(list);
		
		itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Box"))
				itr.remove();
		}
		
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}
}
