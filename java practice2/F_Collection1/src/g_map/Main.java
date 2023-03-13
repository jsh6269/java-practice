package g_map;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(34, "Suhan");
		map.put(14, "Jang");
		map.put(25, "back");
		System.out.println(map.get(34));
		System.out.println(map.get(14));
		System.out.println();
		
		Set<Integer> ks = map.keySet();
		for(Integer n : ks)
			System.out.print(n + " ");
		System.out.println();
		for(Integer n : ks)
			System.out.println(map.get(n));
		System.out.println();
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.println(map.get(itr.next()));
		
	}
}
