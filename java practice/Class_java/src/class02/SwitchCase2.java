package class02;
import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 4;
		int num = 1;
		
		switch(n) {
		case 5:
			num *= 5;
		case 4:
			num *= 4;
		case 3:
			num *= 3;
		case 2:
			num *= 2;
		case 1:
			num *= 1;
		}
		System.out.println(num);
	}
}
