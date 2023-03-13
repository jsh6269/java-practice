package t14;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] s = new double[n];
		for(int i=0;i<n;i++) {
			int a =input.nextInt();
			int b= input.nextInt();
			int c = input.nextInt();
			s[i]=(a+b+c)/3.0;
		}
		Arrays.sort(s);
		for(int i=n-1;i>=0;i--)
			System.out.printf("%.1f\n",s[i]);
	}
}