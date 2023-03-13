package merge_sort;

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
			merge_sort(a, 0, a.length-1);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void merge_sort(int[] a, int low, int high) {
		// 1. base condition
		if(low >= high) return;
		// 2. divide
		int mid = (low + high) / 2;
		// 3. conquer
		merge_sort(a, low, mid);
		merge_sort(a, mid+1, high);
		// 4. combine
		int i = low, j = mid + 1;
		int[] b = new int[a.length];
		for(int k=low; k<=high; k++) {
			if(j > high) 
				b[k] = a[i++];
			else if(i > mid) 
				b[k] = a[j++];
			else if(a[i] < a[j])
				b[k] = a[i++];
			else 
				b[k] = a[j++];
		}
		// 5. copy
		for(i = low; i<=high; i++)
			a[i] = b[i];
	}
}
