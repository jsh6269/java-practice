package z_problem;

interface Calculate<T> {
	T cal(T a, T b);
}

public class P1_calGo {
	public static <T> void calAndShow(Calculate<T> op, T a, T b) {
		T result = op.cal(a, b);
		System.out.println(result);
	}
	public static void main(String[] args) {
		// 3 + 4
		// 2.5 + 7.1
		// 4 - 2
		// 4.9 - 3.2
		calAndShow((a, b) -> a + b, 3, 4);
		calAndShow((a, b) -> a + b, 2.5, 7.1);
		calAndShow((a, b) -> a - b, 4, 2);
		calAndShow((a, b) -> a - b, 4.9, 3.2);
	}
	
}
