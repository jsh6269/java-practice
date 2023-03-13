package g_arrays;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		double[] arOrg = {1.1, 2.1, 5.1, 2.6};
		double[] arCpy1 = Arrays.copyOf(arOrg,  arOrg.length);
		showAll(arCpy1);
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		showAll(arCpy2);

		showAll(Arrays.copyOfRange(arOrg, 1, 3));
		
		double[] cpy = new double[7];
		System.arraycopy(arOrg, 1, cpy, 3, 3);
		showAll(cpy);
		
	}
	public static void showAll(double[] array) {
		for(double x : array)
			System.out.print(x + "\t");
		System.out.println();
	}
}
