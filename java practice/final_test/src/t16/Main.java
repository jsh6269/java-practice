package t16;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[10];
		String[] b = new String[10];
		int cnt = 0;
		for(int i=0;i<10;i++) {
			a[i]=input.next();
		}
		char c = input.next().charAt(0);
		for(int i=0;i<10;i++) {
			if(a[i].indexOf(c)!=-1) {
				b[cnt++]=a[i];
			}
		}
		int min;
		for(int i=0;i<cnt;i++) {
			min = i;
			for(int j=i+1;j<cnt;j++) {
				if(b[min].compareTo(b[j])>0)
					min = j;
			}
			String temp=b[i];
			b[i] = b[min];
			b[min] = temp;
		}
		for(int i=0;i<cnt;i++)
			System.out.println(b[i]);
	}
}