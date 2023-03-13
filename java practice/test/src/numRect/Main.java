package numRect;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		switch(b) {
		case 1:
			ver1(a);
			break;
		case 2:
			ver2(a);
			break;
		case 3:
			ver3(a);
		}
	}
	public static void ver1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
	public static void ver2(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				for(int j=1;j<=n;j++)
					System.out.print(j+" ");
				System.out.println();
			}
			else {
				for(int j=n;j>=1;j--)
					System.out.print(j+" ");
				System.out.println();
			}
		}
	}
	public static void ver3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n; j++)
				System.out.print(i*j+" ");
			System.out.println();
		}
	}
}