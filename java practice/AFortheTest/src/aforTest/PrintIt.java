package aforTest;

public class PrintIt {
	public static void main(String[] args) {
		int num = 0xab2;
		System.out.println(num);
		double a = 3e-4;
		System.out.println(a);
		long num2 = 21323435633L;
		System.out.println(num2);
		
		short x = 5;
		short y = 2;
		short z = (short)(x + y);
		System.out.println(z);
		
		char alpha = 'A';
		System.out.println(alpha++);
		System.out.println(++alpha);
	}
}
