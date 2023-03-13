package class02;
import java.util.Scanner;

public class Makebit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte a = input.nextByte();
		String rep = makeBit(a);
		System.out.println(rep);
		input.close();
	}
	public static String makeBit(byte n) {
		int[] bit = {0, 0, 0, 0, 0, 0, 0, 0};
		byte num = (byte)((n >= 0) ? n : -n);

		for(int i=0; i<8; i++) {
			bit[i] = num % 2;
			num /= 2;
		}
		if(n==-128)
			return "1 0 0 0 0 0 0 0";
		else if(n > 0)
			return toStr(bit);
		else
			return toStr(comp2(bit));
	}
	public static String toStr(int[] bit) {
		String ans = "";
		for(int i=0; i<8; i++) {
			ans = bit[i] + " " + ans;
		}
		return ans;
	}
	public static int[] comp2(int[] bit) {
		for(int i=0; i<8; i++) {
			bit[i] = (bit[i] == 0) ? 1 : 0;
		}
		bit[0] += 1;
		for(int i=0; i<8; i++) {
			if(bit[i]==2) {
				bit[i] = 0;
				if(i!=7)
					bit[i+1] += 1;
			}
		}
		return bit;
	}
}
