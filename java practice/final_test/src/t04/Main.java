package t04;
//������ ������ ���ڿ��� �� �� �Է¹޾� ���̰� ���� ���ڿ��� �� ���ڿ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�� ���ڿ��� ���̴� 100�ڸ� ���� �ʴ´�.
//* ǥ������¹������ �ۼ��ϼ���.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		System.out.printf("%s\n",a.length()<b.length() ? a:b);
		System.out.printf("%s\n",a.length()>b.length() ? a:b);
	}
}