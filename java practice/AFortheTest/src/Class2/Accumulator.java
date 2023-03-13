package Class2;

public class Accumulator {
	static int sum=0;
	public static void add(int num) {
		sum += num;
	}
	public static void show() {
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Accumulator ac = new Accumulator();
		for(int i=1;i<=10;i++)
			ac.add(i);
		ac.show();
	}
}
