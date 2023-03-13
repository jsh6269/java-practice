package charTri;


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char[][] a = new char[101][101];
		char b = 'A';
		if(n<1||n>100||n%2==0) {
			System.out.println("INPUT ERROR");
			return;
		}
		int c = n/2+1; // c는 열의 수이자 중심 행의 번호이다.
		for(int i=c;i>=1;i--) {
			int num = n-2*(i-1); // i열에 존재하는 행의 개수
			// i번째 행부터 시작
			for(int j=i; j<i+num; j++) {
				a[j][i] = (b++);
				if(b>'Z')
					b='A';
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n&&a[i][j]!=0;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
