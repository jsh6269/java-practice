package format;

import java.util.Scanner;
// ����, �Ǽ�, ���ڿ��� ���ʷ� �Է¹޾Ƽ� ���ο� ���ڿ��� ����� �� ��ü�� ���̸� 2����Ͽ� ����ϴ�
// ���α׷��� �ۼ��Ͻÿ�. �Ǽ��� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ� ������ �ϰ�, ���ο� ���ڿ���
// ���̰� Ȧ���� ���� ù ��° �ٿ� �� ���� �� ����Ѵ�.(�Է¹޴� �� ���ڿ��� ���̴� 30�� �����̴�.)
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b =  input.nextDouble();
		String str = input.next();
		String ans = String.format("%d%.3f%s", a,b,str);
		int num = (int)(((double)(ans.length())/2)+0.5);
		for(int i=0;i<num;i++)
			System.out.print(ans.charAt(i));
		System.out.println();
		for(int i=num;i<ans.length();i++)
			System.out.print(ans.charAt(i));
		
	}
}