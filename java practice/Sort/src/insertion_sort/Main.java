package insertion_sort;

import tools.Tool;

public class Main {
	public static void main(String[] args) {
		long avg=0;
		int[] a = {};
		int n=300, n1=0, n2=500;
		Tool.info(n, n1, n2);
		for(int i=0; i<200; i++) {
			a = Tool.setArray(n, n1, n2);
			long t1 = System.nanoTime();
			insertion_sort(a);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void insertion_sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int j, key = a[i];
			for(j=i-1; j>=0 && a[j]>key; j--)
					a[j+1] = a[j];
			a[j+1] = key; 
		}
	}
}
