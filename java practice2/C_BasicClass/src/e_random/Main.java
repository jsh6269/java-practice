package e_random;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
//		Random rand = new Random(System.currentTimeMillis());
		int a = rand.nextInt();
		System.out.println(a);
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextInt(3)); // 0이상 3미만
		// n1이상 n2미만의 random값 추출
		int n1 = 5;
		int n2 = 7;
		int randInt = rand.nextInt(n2-n1) + n1;
		System.out.println(randInt);
		
		double c = rand.nextDouble();  // 0이상 1미만
		float d = rand.nextFloat();    // 0이상 1미만
		System.out.println(c + " " + d);
	}
	
}
