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
		
		System.out.println(n4>>1);   // 1 1 0 0 0 0 0 0    이동에 의해 부호비트가 비면 원래 부호비트로 채움
		System.out.println(n4>>>1);  
		// 0 1 0 0 0 0 0 0    이동에 의해 부호비트가 비면 0으로 채움
		// 일 줄 알았으나 int형으로 바꿔서 연산하기 때문에 이상한 값이 나옴
		
	}
}
