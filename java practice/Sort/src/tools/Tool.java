package tools;

public class Tool {
	public static void info(int n, int n1, int n2) {
		System.out.println("====== Info ======");
		System.out.println(n+" elements from "+n1+" to "+n2+"\n");
	}
	public static int[] setArray(int n, int n1, int n2) {
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = randomRange(n1, n2);
		return a;
	}
	public static int randomRange(int n1, int n2) {
		// Math.random() 은 0.0 이상 1.0 미만의 실수를 반환한다.
		// n1 이상 n2 이하의 정수를 반환한다.
		return (int) (Math.random() * (n2 - n1 + 1)) + n1;
	}
	public static void output(int[] a, long t) {
		System.out.println("====== Result ======");
		System.out.printf("Time spent: %.4f ms\n\n", t/Math.pow(10, 6));
		for(int i=0;i<30;i++)
			System.out.printf(a[i] + " ");
		System.out.println("\n......");
		for(int i=a.length-30;i<a.length;i++)
			System.out.print(a[i] + " ");
	}
}
