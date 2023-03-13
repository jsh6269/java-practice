package heap_sort;

import tools.Tool;

public class Main {
	public static boolean isPop = false;
	public static void main(String[] args) {
		long avg=0;
		int[] a = {};
		int n=300, n1=0, n2=500;
		Tool.info(n, n1, n2);
		for(int i=0; i<200; i++) {
			a = Tool.setArray(n, n1, n2);
			a[0] = 0;
			long t1 = System.nanoTime();
			heap_sort(a);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void heapify(int[] a, int s, int i) {
		int k = i*2;
		if(i==0) return;
		if(k > s) return;
		if(k+1 <= s && a[k] < a[k+1]) k = k+1;
		if(a[i] < a[k]) {
			swap(a, i, k);
			heapify(a, s, k);
		}
		if(isPop == false)
			heapify(a, s, i-1);
	}
	public static void heap_sort(int[] a) {
		isPop = false;
		heapify(a, a.length-1, (a.length-1)/2);
		isPop = true;
		for(int i=a.length-1; i>=2; i--) {
			swap(a, 1, i);
			heapify(a, i-1, 1);
		}
	}
	public static void swap(int[] a, int n1, int n2) {
		int temp = a[n1];
		a[n1] = a[n2];
		a[n2] = temp;
	}
}
