package a_wrapperMethod;

public class Main {
	public static void main(String[] args) {
		Integer num1 = new Integer(3);
		Integer num2 = new Integer(5);
		int n1 = num1.intValue();
		System.out.println(n1);
		int n2 = num2;
		System.out.println(n2);
		System.out.println();
		
		System.out.println(Integer.max(num1, num2));
		System.out.println(Integer.min(num1, num2));
		System.out.println(Integer.sum(num1, num2));
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toOctalString(num1));
		System.out.println(Integer.toHexString(num1));
		System.out.println();
		
		Integer num3 = Integer.valueOf("23124");
		Integer num4 = Integer.valueOf(1245123);
		System.out.println(num3);
		System.out.println(num4);
		
		String n = "123.12";
		double a = Double.valueOf(n);
		int b = Double.valueOf(n).intValue();
		System.out.println(a);
		System.out.println(b);
	}
}
