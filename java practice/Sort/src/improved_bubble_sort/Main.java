package improved_bubble_sort;

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
			improved_bubble_sort(a);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void improved_bubble_sort(int[] a) {
		boolean flag = true;
		for(int i=a.length-1; i>0 && flag; i--) {
			flag = false;
			for(int j=0; j<=i-1; j++)
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
		}
	}
}
