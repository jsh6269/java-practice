package class02;

public class SCE {
	public static void main(String[] args) {
		// 중간고사에 나옴
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0); 
		// 맨 앞의 false만 보고 빠져나와 num1만 증가됨 
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		// 맨 앞의 true만 보고 빠져나와 num1만 증가됨
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();

		result = ((num1 += 10) < 0) || ((num2 += 10) > 0);
		// false, true 이므로 num1, num2 모두 증가됨
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();
		
	}
}
