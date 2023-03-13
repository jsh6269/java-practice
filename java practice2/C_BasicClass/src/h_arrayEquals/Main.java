package h_arrayEquals;
import java.util.Arrays;

class INum {
	private int num;
	INum(int x) {
		num = x;
	}
	public boolean equals(Object obj) {
		return num == ((INum)obj).num;
	}
}

public class Main {
	public static void main(String[] args) {
		INum[] arr1 = new INum[4];
		INum[] arr2 = new INum[4];
		arr1[0] = new INum(1); arr2[0] = new INum(1);
		arr1[1] = new INum(2); arr2[1] = new INum(2);
		arr1[2] = new INum(3); arr2[2] = new INum(3);
		arr1[3] = new INum(4); arr2[3] = new INum(4);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(arr1 == arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println();
		
		
		double[] arr3 = {1.1, 2.3, 4.2};
		double[] arr4 = {1.1, 2.3, 4.2};
		double[] arr5 = Arrays.copyOf(arr3, arr3.length);
		double[] arr6 = arr3;
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(arr3 == arr4);
		System.out.println(arr3.equals(arr4));
		System.out.println();
		
		System.out.println(Arrays.equals(arr3, arr5));
		System.out.println(arr3 == arr5);
		System.out.println(arr3.equals(arr5));
		System.out.println();
		
		System.out.println(Arrays.equals(arr3, arr6));
		System.out.println(arr3 == arr6);
		System.out.println(arr3.equals(arr6));
	}
}
