package class01;

public class Character {
	public static void main(String[] args) {
		char A = 65;
		char a = 97;
		System.out.println(A + ", "+ a);
		
		A++;
		System.out.println(A);
		A += 1;
		System.out.println(A);
		// A = A + 1;  error cannot convert int to char
		
		System.out.println(a);
		System.out.println((int)a);
		
		char c1 = '¾Æ';
		char c2 = 'Èñ';
		System.out.printf("%d %d\n", (int)c1, (int)c2);
		System.out.println(c1 + "" + c2);
		
	}

}
