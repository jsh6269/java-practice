package class01;

public class Variable {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20; // int형의 범우 -2147483648 ~ 2147483647
		int num3 = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + num3);
		System.out.printf("%d + %d = %d\n", num1, num2, num3);

		double real1 = 0.35;
		double real2 = 0.24;
		System.out.println(real1 + " + " + real2 + " = " + (real1 + real2));

		float real3 = 0.35F;
		float real4 = 0.24f;
		System.out.printf("%.2f + %.2f = %.2f\n", real3, real4, real3 + real4);
				
		char alpha = 'A';
		boolean isPassed = true;
		System.out.println(alpha + "\t" + isPassed);
		
		short a1 = 5;
		short a2 = 30;
		short a3 = (short)(a1 + a2);
		System.out.println("Sum : " + a3);
				
		long b1 = 567345293739401L;
		long b2 = 127468459182L;
		System.out.println(b1 + b2);

		byte c1 = 12;
		byte c2 = 4;
		byte c3 = (byte)(c1 + c2);
		System.out.println(c3);

		
		// 음수의 표현
		// => 2의 보수를 취한 것
		//  = 1의 보수를 취한 뒤 1을 더함
		// ex) 1101 - 1001 = 0100   // 13 - 9 = 4
        //     1101 + 0111 = 0100
		
	}
}



