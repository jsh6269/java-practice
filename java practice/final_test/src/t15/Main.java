package t15;
//GOOD SOURCE!!
import java.util.Scanner;
//공백을 포함한 한 문장을 입력받아서 전체 길이와 가장 긴 단어를 출력하시오.
//
//단, 문장의 길이는 최대 100자 이내이고, 길이가 가장 긴 단어가 여러 개인 경우 공백으로 분리하여 한 줄에 입력 받은 순서대로 모두 출력하시오.
//
//이 문제에서의 단어란? 공백으로 분리하는 문자열을 뜻한다.
//"i am a boy." 문자열의 경우
//"i", "am", "a", "boy."가 각각 단어이다.
//
// 
//
//* 표준입출력방식으로 작성하세요.
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a= input.nextLine();
		System.out.println(a.length());
		String[] b = a.split(" ");
		String c = "";
		int longest = 0;
		for(int i=0;i<b.length;i++) {
			if(longest<b[i].length()) {
				longest = b[i].length();
				c=b[i];
			}
			else if(longest == b[i].length()) {
				c = c+" "+b[i];
			}
		}
		System.out.println(c);
	}
}