package t03;

import java.util.Scanner;
//10���� �л� �̸��� ������ �Է¹޾� �̸��� ����, ����� �Է¹��� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//��, ��½� "�̸�", "����", "���"�� �� ĭ�� �������� ������ �ϸ�, Name�� 4ĭ(%4s), Score�� 5ĭ(%5d), Rank�� �� 4ĭ(%4d)���� ����Ѵ�.
//
// 
//
//* ǥ������¹������ �ۼ��ϼ���.
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[10];
		int[] b =  new int[10];
		int[] c = {1,1,1,1,1,1,1,1,1,1};
		for(int i=0;i<10;i++) {
			a[i]=input.next();
			b[i]=input.nextInt();
		}
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				if(i!=j && b[i]<b[j])
					c[i]++;
		System.out.println("Name Score Rank");
		for(int i=0; i<10; i++)
			System.out.printf("%4s %5d %4d\n",a[i],b[i],c[i]);
	}
}