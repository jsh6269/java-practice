package t11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int n = 0;
		while(a!=0) {
			if(a%3==0 && a%5==0) {
				System.out.print(a+" ");
				n++;
			}
			a = input.nextInt();
		}
		if(n!=0) System.out.println();
		System.out.println(n);

	}
}