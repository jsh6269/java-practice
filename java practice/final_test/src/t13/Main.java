package t13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int cnt = 0;
		for(int i=a;i<=b;i++) {
			if(i%4==0 && i%100!=0||i%400==0)
				cnt++;
		}
		System.out.println(cnt);
	}
}