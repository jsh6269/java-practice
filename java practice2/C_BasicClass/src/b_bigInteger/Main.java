package b_bigInteger;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		BigInteger b1 = new BigInteger("12497481029948209348029249812");
		BigInteger b2 = new BigInteger("12497481029948209348029249830");
		System.out.println(b1);
		System.out.println();
		
		BigInteger b3 = b1.add(b2);
		System.out.println(b3);
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b2.remainder(b1));
		
	}
}
