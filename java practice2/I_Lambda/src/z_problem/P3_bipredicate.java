package z_problem;
import java.util.function.*;

public class P3_bipredicate {
	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = (str, n) -> str.length() > n;
        if(conv.test("Robot", 3))
            System.out.println("���ڿ� ���� 3 �ʰ�");
        else
            System.out.println("���ڿ� ��� 3 ����");

        if(conv.test("Box", 5))
            System.out.println("���ڿ� ���� 5 �ʰ�");
        else
            System.out.println("���ڿ� ��� 5 ����");
	}
}
