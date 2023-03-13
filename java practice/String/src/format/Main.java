package format;

import java.util.Scanner;
// 정수, 실수, 문자열을 차례로 입력받아서 새로운 문자열에 출력한 후 전체의 길이를 2등분하여 출력하는
// 프로그램을 작성하시오. 실수는 반올림하여 소수 셋째자리까지 출력하는 것으로 하고, 새로운 문자열의
// 길이가 홀수일 때는 첫 번째 줄에 한 개를 더 출력한다.(입력받는 각 문자열의 길이는 30자 이하이다.)
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b =  input.nextDouble();
		String str = input.next();
		String ans = String.format("%d%.3f%s", a,b,str);
		int num = (int)(((double)(ans.length())/2)+0.5);
		for(int i=0;i<num;i++)
			System.out.print(ans.charAt(i));
		System.out.println();
		for(int i=num;i<ans.length();i++)
			System.out.print(ans.charAt(i));
		
	}
}