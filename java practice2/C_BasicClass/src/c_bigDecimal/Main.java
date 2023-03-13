package c_bigDecimal;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("1.5");
		BigDecimal b2 = new BigDecimal("4.6");
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
//		System.out.println(b1.divide(b2));
//		System.out.println(b1.remainder(b2));
	}
}
