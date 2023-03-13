package z_problem;
import java.util.function.*;

public class P3_bipredicate {
	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = (str, n) -> str.length() > n;
        if(conv.test("Robot", 3))
            System.out.println("문자열 길이 3 초과");
        else
            System.out.println("문자열 길아 3 이하");

        if(conv.test("Box", 5))
            System.out.println("문자열 길이 5 초과");
        else
            System.out.println("문자열 길아 5 이하");
	}
}
