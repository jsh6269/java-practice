package multi;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if(a<b)
			for(int i=a; i<=b; i++)
				gugudan(i);
		else
			for(int i=a; i>=b; i--)
				gugudan(i);
			
	}
	public static void gugudan(int a) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %2d   ",a,i,a*i);
			if(i%3==0)
				System.out.println();
		}
		System.out.println();
	}
}