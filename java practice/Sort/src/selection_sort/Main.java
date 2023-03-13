package selection_sort;
import tools.Tool;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long avg=0;
		int[] a = {};
		int n=300, n1=0, n2=500;
		Tool.info(n, n1, n2);
		for(int i=0; i<200; i++) {
			a = Tool.setArray(n, n1, n2);
			long t1 = System.nanoTime();
			selection_sort(a);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void selection_sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++)
				if(a[j]<a[min])
					min = j;
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}
