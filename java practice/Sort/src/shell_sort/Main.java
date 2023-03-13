package shell_sort;

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
			shell_sort(a);
			long t2 = System.nanoTime();
			avg += (t2-t1)/200;
		}
		Tool.output(a, avg);
	}
	public static void shell_sort(int[] a) {
		for(int gap=a.length/2; gap>0; gap/=2) {
			if(gap%2==0)
				gap++;
			for(int i=0; i<gap; i++)
				insertion(a, i, gap);
		}
	}
	public static void insertion(int[] a, int first, int gap) {
		for(int i=first+gap; i<a.length; i+=gap) {
			int j, key = a[i];
			for(j=i-gap; j>=first && a[j]>key; j-=gap)
				a[j+gap] = a[j];
			a[j+gap] = key; 
		}
	}
}
