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
		int c = n/2+1; // c�� ���� ������ �߽� ���� ��ȣ�̴�.
		for(int i=c;i>=1;i--) {
			int num = n-2*(i-1); // i���� �����ϴ� ���� ����
			// i��° ����� ����
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
