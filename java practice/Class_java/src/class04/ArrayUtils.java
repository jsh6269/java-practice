package class04;
import java.util.Arrays;

public class ArrayUtils {
	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7);
		System.arraycopy(ar1, 0, ar2, 3, 4);
		for(int e : ar1)
			System.out.print(e+" ");
		System.out.println();
		for(int e : ar2)
			System.out.print(e+" ");
		System.out.println();
	}
}
