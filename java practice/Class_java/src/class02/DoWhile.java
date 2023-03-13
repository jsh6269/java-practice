package class02;

public class DoWhile {
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("I don't like Java " + num);
			num += 1;
		} while(num < 5);
		
		System.out.println("current num: " + num);
	}
}
