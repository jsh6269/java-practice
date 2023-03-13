package t04;
//공백을 포함한 문자열을 두 번 입력받아 길이가 작은 문자열과 긴 문자열의 순으로 출력하는 프로그램을 작성하시오.
//각 문자열의 길이는 100자를 넘지 않는다.
//* 표준입출력방식으로 작성하세요.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		System.out.printf("%s\n",a.length()<b.length() ? a:b);
		System.out.printf("%s\n",a.length()>b.length() ? a:b);
	}
}