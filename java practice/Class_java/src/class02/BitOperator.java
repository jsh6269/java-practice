package class02;

public class BitOperator {
	public static void main(String[] args) {
		// pg 99
		byte n1 = 5;  // 0 0 0 0 0 1 0 1
		byte n2 = 3;  // 0 0 0 0 0 0 1 1 
		byte n3 = -1; // 1 1 1 1 1 1 1 1 
		
		byte r1 = (byte)(n1 & n2);  // �� �� 1�̸� 1�� ��ȯ
		byte r2 = (byte)(n1 | n2);  // �� �� �ϳ��� 1�̸� 1�� ��ȯ
		byte r3 = (byte)(n1 ^ n2);  // �� ��Ʈ�� ���� �ٸ��� 1�� ��ȯ
		byte r4 = (byte)(~n3);      // 0�� 1�� ����
		System.out.printf("%d %d %d %d", r1, r2, r3, r4);
	}
}
