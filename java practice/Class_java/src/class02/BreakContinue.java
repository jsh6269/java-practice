package class02;

public class BreakContinue {
	public static void main(String[] args) {
		// ���� ó������ 5�� ����̸鼭 7�� ��� �� ���� ã��
		int num = 1;
		while(true) {
			if((num % 5 == 0) && (num % 7 == 0)) {
				System.out.println(num);
				break;
			}
			num++;
		}
		System.out.println();
		
		// 5�� ����̸鼭 7�� ����� ���� 1~100 �� �� ���ִ����� ������ ���� ������ ã��
		num = 0;
		int count = 0;
		while((num++) < 100) {
			if((num % 5 != 0) || (num%7 != 0))
				continue; // ���� �Ĵٺ��� �ʰ� while�� ���ǽ����� �ǵ��ư�
			count++;
			System.out.println(num);
		}
		System.out.println("num: " + count);
		
	}
}
