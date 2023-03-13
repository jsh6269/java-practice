package split;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] a = str.split(" ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}