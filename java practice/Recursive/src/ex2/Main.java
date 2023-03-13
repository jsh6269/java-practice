package ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		process(n);
	}
	public static void process(int n) {
		if(n<1)
			return;
		process(n/2);
		System.out.print(n+" ");
	}
}