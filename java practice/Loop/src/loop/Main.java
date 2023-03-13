package loop;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		char alpha = 'a';
		int n = input.nextInt();
		for(int i =1; i<=n-1; i++){
			for(int j=1; j<=i; j++)
				System.out.print(alpha++ + " ");
			for(int j=1; j<=n-i; j++)
				System.out.print(num++ + " ");
			System.out.println();
		}
	}
}
