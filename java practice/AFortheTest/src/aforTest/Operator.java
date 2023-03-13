package aforTest;
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
//		char c = input.next().charAt(0);
		String c = input.next();
		int b = input.nextInt();
		switch(c) {
		case "+":
			System.out.printf("%d + %d = %d",a,b,a+b);
			break;
		case "-":
			System.out.printf("%d - %d = %d",a,b,a-b);
			break;
		case "*":
			System.out.printf("%d * %d = %d",a,b,a*b);
			break;
		case "/":
			System.out.printf("%d / %d = %d",a,b,a/b);
			break;
		case "%":
			System.out.printf("%d %% %d = %d",a,b,a%b);
			break;
		case "^":
			System.out.printf("%d ^ %d = %d",a,b,(int)Math.pow(a, b));
			break;
		default:
			System.out.print("Cannot understand what you mean");
		}
	}
}
