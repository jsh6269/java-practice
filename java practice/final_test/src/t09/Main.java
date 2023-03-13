package t09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b=  input.nextInt();
		char c = input.next().charAt(0);
		System.out.printf("%d %c %d = ",a,c,b);
		switch(c) {
		case '+':
			System.out.print(a+b);
			break;
		case '-':
			System.out.print(a-b);
			break;
		case '*':
			System.out.print(a*b);
			break;
		case '/':
			System.out.print(a/b);
			break;
		case '%':
			System.out.print(a%b);
		}
	}
}