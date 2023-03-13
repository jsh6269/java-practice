package aforTest;

public class Insert {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		num1 = num2 = num3;
		System.out.printf("%d %d %d", num1, num2, num3);
		// 모두 30이 나옴. 대입연산자는 오른쪽에서 왼쪽방향으로 작용하기 때문이라고 생각함.
	}
}
