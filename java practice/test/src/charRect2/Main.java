package charRect2;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char[][] a = new char[n+1][n+1];
		char temp = 'A';
		for(int i=1;i<=n;i++) {
			if(i%2==1)
				for(int j=1;j<=n;j++) {
					a[j][i] = (temp++);
					if(temp>'Z')
						temp='A';
				}
			else
				for(int j=n;j>=1;j--) {
					a[j][i] = (temp++);
					if(temp>'Z')
						temp='A';
				}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}