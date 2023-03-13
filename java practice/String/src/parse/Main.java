package parse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		int a = goInt(str1);
		int b = goInt(str2);
		System.out.println(a*b);
	}
	public static int goInt(String str) {
		int finish=str.length();
		for(int i=0;i<str.length();i++) {
			if('0'<=str.charAt(i)&&str.charAt(i)<='9')
				continue;
			else {
				finish = i;
				break;
			}
		}
		return Integer.parseInt(str.substring(0,finish));
	}
}