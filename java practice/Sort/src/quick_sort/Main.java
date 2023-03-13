package quick_sort;

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
			quick_sort(a, 0, a.length-1);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static int partition(int[] a, int left, int right) {
		int low = left + 1;
		int high = right;
		int pivot = a[left];
		while(low <= high) {
			for(;low<=right && a[low]<=pivot; low++);
			for(;high>left && a[high]>=pivot; high--);
			if(low < high)
				swap(a, low, high);
		}
		swap(a, left, high);
		return high;
	}
	public static void quick_sort(int[] a, int left, int right) {
		int q;
		if(left < right) {
			q = partition(a, left, right);
			quick_sort(a, left, q-1);
			quick_sort(a, q+1, right);
		}
	}
	public static void swap(int[] a, int n1, int n2) {
		int temp = a[n1];
		a[n1] = a[n2];
		a[n2] = temp;
	}
}