package class02;

public class BitShiftOp {
	public static void main(String[] args) {
		// pg 101
		byte n1 = 5; // 0 0 0 0 0 1 0 1
		byte n2 = 3; // 0 0 0 0 0 0 1 1
		System.out.println(n1<<1); // 0 0 0 0 1 0 1 0
		System.out.println(n1>>1); // 0 0 0 0 0 0 1 0
		
		byte n3 = 127;   // 0 1 1 1 1 1 1 1 
		byte n4 = -127;  // 1 0 0 0 0 0 0 1 
		
		System.out.println(n4>>1);   // 1 1 0 0 0 0 0 0    �̵��� ���� ��ȣ��Ʈ�� ��� ���� ��ȣ��Ʈ�� ä��
		System.out.println(n4>>>1);  
		// 0 1 0 0 0 0 0 0    �̵��� ���� ��ȣ��Ʈ�� ��� 0���� ä��
		// �� �� �˾����� int������ �ٲ㼭 �����ϱ� ������ �̻��� ���� ����
		
	}
}
