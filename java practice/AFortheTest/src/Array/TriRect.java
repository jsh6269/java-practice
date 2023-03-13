package Array;

public class TriRect {
	public static void main(String[] args) {
		int num = 1;
		char c = 'A';
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=3;j++) {
				if(i<j)
					System.out.print((c++)+" ");
				else
					System.out.print((num++)+" ");
			}
			System.out.println();
		}
	}
}
