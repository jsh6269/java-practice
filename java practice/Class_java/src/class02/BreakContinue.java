package class02;

public class BreakContinue {
	public static void main(String[] args) {
		// 가장 처음으로 5의 배수이면서 7의 배수 인 수를 찾기
		int num = 1;
		while(true) {
			if((num % 5 == 0) && (num % 7 == 0)) {
				System.out.println(num);
				break;
			}
			num++;
		}
		System.out.println();
		
		// 5의 배수이면서 7의 배수인 수가 1~100 에 몇 개있는지와 각각이 무슨 수인지 찾기
		num = 0;
		int count = 0;
		while((num++) < 100) {
			if((num % 5 != 0) || (num%7 != 0))
				continue; // 밑은 쳐다보지 않고 while의 조건식으로 되돌아감
			count++;
			System.out.println(num);
		}
		System.out.println("num: " + count);
		
	}
}
