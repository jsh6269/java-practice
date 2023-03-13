package Array;

public class SwitchArray {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		showArray(arr);
		int[] lastRow = arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=lastRow;
		System.out.println();
		showArray(arr);
	}
	public static void showArray(int[][] arr) {
		for(int[] e : arr) {
			for(int val : e)
				System.out.print(val + " ");
			System.out.println();
		}
	}
}