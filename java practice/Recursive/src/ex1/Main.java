package ex1;

import java.util.Scanner;
// ÇÔ¼ö 3, 590
public class Main {
	static int n;
	static int[] a = new int[11];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		a[0]=1;
		dice(1);
	}
	public static void dice(int level) {
		if(level>n) {
			output();
			return;
		}
		for(int i=a[level-1];i<=6;i++) {
			a[level]=i;
			dice(level+1);
		}
	}
	public static void output() {
		for(int i=1;i<=n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}