package t15;
//GOOD SOURCE!!
import java.util.Scanner;
//������ ������ �� ������ �Է¹޾Ƽ� ��ü ���̿� ���� �� �ܾ ����Ͻÿ�.
//
//��, ������ ���̴� �ִ� 100�� �̳��̰�, ���̰� ���� �� �ܾ ���� ���� ��� �������� �и��Ͽ� �� �ٿ� �Է� ���� ������� ��� ����Ͻÿ�.
//
//�� ���������� �ܾ��? �������� �и��ϴ� ���ڿ��� ���Ѵ�.
//"i am a boy." ���ڿ��� ���
//"i", "am", "a", "boy."�� ���� �ܾ��̴�.
//
// 
//
//* ǥ������¹������ �ۼ��ϼ���.
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a= input.nextLine();
		System.out.println(a.length());
		String[] b = a.split(" ");
		String c = "";
		int longest = 0;
		for(int i=0;i<b.length;i++) {
			if(longest<b[i].length()) {
				longest = b[i].length();
				c=b[i];
			}
			else if(longest == b[i].length()) {
				c = c+" "+b[i];
			}
		}
		System.out.println(c);
	}
}