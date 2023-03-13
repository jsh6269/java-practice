package t07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a= input.nextDouble();
		double b= input.nextDouble();
		System.out.printf("%.2f %.2f %.2f",a,b,a+b);
	}
}
