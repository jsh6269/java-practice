package class02;

public class SCE {
	public static void main(String[] args) {
		// �߰���翡 ����
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0); 
		// �� ���� false�� ���� �������� num1�� ������ 
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		// �� ���� true�� ���� �������� num1�� ������
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();

		result = ((num1 += 10) < 0) || ((num2 += 10) > 0);
		// false, true �̹Ƿ� num1, num2 ��� ������
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();
		
	}
}
