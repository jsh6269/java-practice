package class02;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// p.150 ������ ���� ������ �ʾҴ�.
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		if(n==0)
			return 1;  // ��������
		else
			return n * factorial(n-1);
	}
}
