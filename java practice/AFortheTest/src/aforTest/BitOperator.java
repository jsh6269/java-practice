package aforTest;

public class BitOperator {
	public static void main(String[] args) {
		byte n1 = 5;
		byte n2 = 3;
		byte n3 = -4;
		
		byte r1 = (byte)(n1 & n2);
		byte r2 = (byte)(n1 | n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(n1 ^ n3);
		byte r5 = (byte)(~n3);
		
		System.out.printf("%d %d %d %d %d\n",r1,r2,r3,r4,r5);
		
		// BitShift Operator
//		byte c1 = (byte)(n3>>>2);
//		System.out.println(c1);
		byte num;
		num=8;
		System.out.println((byte)(num>>2));
		System.out.println((byte)(num>>3));
		System.out.println((byte)(num<<2));
		
		num = -6;
		System.out.println((byte)(num>>4));
		System.out.println((byte)(num<<1));
//		1 7 6 -7 3
//		2
//		1
//		32
//		-1
//		-12

	}
}
