package t02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double temp = 0;
		for(int i=1;i<=8;i++)
			temp = input.nextDouble();
		double b = input.nextDouble();
		System.out.printf("%.1f",(a+b)/2);	
	}
}
