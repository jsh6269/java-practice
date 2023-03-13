package excercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		for(int i=1;i<=5;i++) {
			String temp = input.next();
			str+=temp;
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			if(i%3==2)
				System.out.println();
		}
	}
}