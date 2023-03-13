package a_lambda2;
import java.util.Random;

interface Calculate {
	void cal(int a, int b);
}

interface Calculate2 {
	int cal(int a, int b);
}

interface HowLong {
	int len(String str);
}

interface Generator {
	int rand();
}

public class Main {
	public static void main(String[] args) {
		Calculate plus = (a, b) -> System.out.println(a + b);
		plus.cal(3, 6);
		Calculate minus = (a, b) -> System.out.println(a - b);
		minus.cal(7, 2);
		
		Calculate2 plus2 = (a, b) -> a + b;
		int c = plus2.cal(2, 7);
		System.out.println(c);
		
		HowLong h1 = s -> s.length();
		System.out.println(h1.len("This is crazy"));
		
		Generator getRand = () -> {
			Random ran = new Random();
			return ran.nextInt(50);
		};
		System.out.println(getRand.rand());
	}
}
