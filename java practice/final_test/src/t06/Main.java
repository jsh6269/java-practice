package t06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a=input.nextDouble();
		while(a!=0) {
			System.out.printf("%.2f\n",a/(2*3.14));
			a = input.nextDouble();
		}
	}
}