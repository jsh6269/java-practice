package substring;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j, len;
		char imsi;
		String word = input.next();
		len = word.length();
		for (i = 0; i < len; i++) {
			word = word.substring(1) + word.charAt(0);
			System.out.println(word);
		}
	}
}