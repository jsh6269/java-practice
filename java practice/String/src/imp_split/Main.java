package imp_split;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] a = new String[101];
		int cnt = 1;
		a[1]="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				a[++cnt]="";
			else
				a[cnt]+=str.charAt(i);
		}
		for(int i=1;i<=cnt;i+=2)
			System.out.println(a[i]);
	}
}