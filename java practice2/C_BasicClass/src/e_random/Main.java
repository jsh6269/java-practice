package e_random;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
//		Random rand = new Random(System.currentTimeMillis());
		int a = rand.nextInt();
		System.out.println(a);
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextInt(3)); // 0�̻� 3�̸�
		// n1�̻� n2�̸��� random�� ����
		int n1 = 5;
		int n2 = 7;
		int randInt = rand.nextInt(n2-n1) + n1;
		System.out.println(randInt);
		
		double c = rand.nextDouble();  // 0�̻� 1�̸�
		float d = rand.nextFloat();    // 0�̻� 1�̸�
		System.out.println(c + " " + d);
	}
	
}
