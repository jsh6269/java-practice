package class02;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		char op = input.next().charAt(0);
		int b = input.nextInt();

		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d", a, op, b, a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d", a, op, b, a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d", a, op, b, a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %d", a, op, b, a/b);
			break;
		case '%':
			System.out.printf("%d %c %d = %d", a, op, b, a%b);
			break;
		case '^':
			System.out.printf("%d %c %d = %d", a, op, b, (int)Math.pow(a, b));
			break;
		default:
			System.out.println("Cannot recognize the operator!");
		}
	}
}
