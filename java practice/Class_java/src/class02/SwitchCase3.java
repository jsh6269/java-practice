package class02;

public class SwitchCase3 {
	public static void main(String[] args) {
		int n = 5;
		int m = 2;
		isLower(n);
		isLower(m);
	}
	public static void isLower(int n) {
		switch(n) {
		case 1:
		case 2:
		case 3:
			System.out.println(n + " is lower than 4");
			break;
		default:
			System.out.println(n + " isn't lower than 4");
		}
	}
}
