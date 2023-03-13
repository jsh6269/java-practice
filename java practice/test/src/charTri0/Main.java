package charTri0;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char[][] a = new char[n+1][n+1];
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=' ';
		char temp = 'A';
		for(int i=n+1;i<=n+n; i++) {
			for(int j=n;i-j<=n;j--) {
				a[i-j][j] = (temp++);
				temp = temp>'Z' ? 'A':temp;
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}