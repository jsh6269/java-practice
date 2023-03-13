package staticVar;

import java.util.Scanner;
class Rect{
	private int r;
	private int c;
	private int size;
	static private int max_area;
	
	Rect(int r, int c){
		this.r = r;
		this.c = c;
		size = r*c;
		if(max_area<size)
			max_area = size;
	}
	static int get_max() {
		return max_area;
	}
	void output() {
		System.out.printf("area : %d\n", size);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Input data : ");
			int r = input.nextInt();
			int c = input.nextInt();
			if(r==0 || c==0)
				break;
			Rect A = new Rect(r, c);
			A.output();
		}
		System.out.println("Max area : " + Rect.get_max());
	}
}