package t08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b=  input.nextInt();
		int c = input.nextInt();
		int t=a+b+c;
		System.out.printf("%d %d...%d",t,t/3,t%3);
	}
}
