package Array;
import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		Arrays.fill(arr, 3);
		arr[2]=5;
		showArray(arr);
		System.arraycopy(arr, 2, arr2, 4, 5);
		showArray(arr2);
		// arr�� 2��° �ε������� 5���� arr2�� 4��° �ε������� 5���� �ű��. 
	}
	public static void showArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}