package charRect;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char x='A';
		int n = input.nextInt();
		char[][] a = new char[n+1][n+1];
		for(int j=n;j>=1;j--) {
			for(int i=n;i>=1;i--) {
				a[i][j] = (x++);
				if(x>'Z')
					x='A';
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}