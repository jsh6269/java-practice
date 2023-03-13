package t10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int t = 1;
		for(int i=1;i<=n;i++)
			t*=i;
		System.out.println(t);
	}
}