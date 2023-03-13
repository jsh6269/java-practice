package sdf;

import java.util.Scanner;

public class awer {
	public static int makeIt(int val, int cnt) {
		int a = 0;
		int b;
		if(val==1)
			return 0;
		if(val%3==0) {
			b = makeIt(val/3, cnt+1) + 1;
			if(a==0)
				a = b;
			else if(a!=0 && b<a)
				a = b;
		}
		if(val%2==0) {
			b = makeIt(val/2, cnt+1) + 1;
			if(a==0)
				a = b;
			else if(a!=0 && b<a)
				a = b;
		}
		b = makeIt(val-1, cnt+1) + 1;
		if(a==0)
			a = b;
		else if(a!=0 && b<a)
			a = b;
		return a;
	}
	public static int fun(int n) {
		int dp[] = new int[n + 1];
		dp[0] = dp[1] = 0;
		for (int i = 2; i <= n; i++) { //최종 숫자는 n이기 때문에 n까지 반복연산
			dp[i] = dp[i - 1] + 1;
	        if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
	        if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
	    }
		return dp[n];
	}

	public static void main(String[] args) {
		for(int i=1; i<=300; i++)
			if(fun(i)!=makeIt(i, 0)) {
				System.out.println("Error occurred");
				System.out.println(i);
			}
		System.out.println("process ended");
	}
}
