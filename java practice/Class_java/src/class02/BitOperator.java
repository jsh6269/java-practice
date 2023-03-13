package class02;

public class BitOperator {
	public static void main(String[] args) {
		// pg 99
		byte n1 = 5;  // 0 0 0 0 0 1 0 1
		byte n2 = 3;  // 0 0 0 0 0 0 1 1 
		byte n3 = -1; // 1 1 1 1 1 1 1 1 
		
		byte r1 = (byte)(n1 & n2);  // 둘 다 1이면 1을 반환
		byte r2 = (byte)(n1 | n2);  // 둘 중 하나가 1이면 1을 반환
		byte r3 = (byte)(n1 ^ n2);  // 두 비트가 서로 다르면 1을 반환
		byte r4 = (byte)(~n3);      // 0과 1을 반전
		System.out.printf("%d %d %d %d", r1, r2, r3, r4);
	}
}
