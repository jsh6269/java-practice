package c_supplier;
import java.util.*;
import java.util.function.*;

class SupplierDemo {
	public static List<Integer> makeIntList(Supplier<Integer> s, int n){
		List<Integer> lst = new ArrayList<>();
		for(int i=0; i<n; i++) {
			lst.add(s.get());
		}
		return lst;
	}
}

public class Main {
	public static void main(String[] args) {
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		List<Integer> list = SupplierDemo.makeIntList(spr, 10);
		System.out.println(list);
	}
}
