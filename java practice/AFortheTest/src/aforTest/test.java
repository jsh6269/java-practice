package aforTest;
import java.util.Arrays;
public class test {
	public static void main(String[] args) {
		int n = 45;
		binary(n);
	
	}
	public static void binary(int n) {
		if(n==0)
			return;
		binary(n/2);
		System.out.print(n%2);
	}
}
