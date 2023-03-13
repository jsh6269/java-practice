package Array;

public class Array {
	public static void main(String[] args) {
		int[] ar = {1,2,3,5,3,7,1};
		int sum = sumOfArray(ar);
		System.out.println(sum);
	}
	public static int sumOfArray(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++)
			sum+=ar[i];
		return sum;
	}
}
