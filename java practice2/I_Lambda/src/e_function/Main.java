package e_function;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		Function<String, Integer> f = str -> str.length();
		System.out.println(f.apply("This is good"));
	}
}
