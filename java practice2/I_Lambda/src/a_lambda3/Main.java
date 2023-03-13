package a_lambda3;

interface Calculate<T> {
	T cal(T a, T b);
}
public class Main {
	public static void main(String[] args) {
		Calculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(2, 3));
		
		Calculate<Double> cb = (a, b) -> a * b;
		System.out.println(cb.cal(2.34, 1.62));
	}
}
