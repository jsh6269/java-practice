package z_problem;
import java.util.Random;
import java.util.Scanner;

public class P1_randChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int A = input.nextInt();
		int Z = input.nextInt();
		if(A <= Z) {
			int num = rand.nextInt(Z-A+1) + A;
			System.out.println(num);
		}
		else {
			int num = rand.nextInt(A-Z+1) + Z;
			System.out.println(num);
		}
		
//		// A�̻� Z������ ���ڸ� random
//		int a = 'A';
//		int z = 'Z';
//		Random rand = new Random();
//		char randChar = (char)(rand.nextInt(z + 1 -a) + a);
//		System.out.println(randChar);
	}
}
