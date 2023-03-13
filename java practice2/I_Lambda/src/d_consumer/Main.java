package d_consumer;
import java.util.function.*;
import java.util.Scanner;

public class Main {
	public static int makeIt(int val, int cnt) {
		int a = 0;
		int b;
		if(val==1)
			return 0;
		if(val%3==0) {
			b = makeIt(val/3, cnt+1);
			if(a==0)
				a = b+1;
			else if(a!=0 && b<a)
				a = b+1;
		}
		if(val%2==0) {
			b = makeIt(val/2, cnt+1);
			if(a==0)
				a = b+1;
			else if(a!=0 && b<a)
				a = b+1;
		}
		b = makeIt(val-1, cnt+1);
		if(a==0)
			a = b+1;
		else if(a!=0 && b<a)
			a = b+1;
		return a;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		System.out.println(makeIt(n, 0));
	}
}
