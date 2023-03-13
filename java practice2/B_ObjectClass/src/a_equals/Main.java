package a_equals;

class INum {
	private int num;
	INum(int num){
		this.num = num;
	}
	public boolean equals(Object obj) {
		return this.num == ((INum)obj).num;
	}
}

public class Main {
	public static void main(String[] args) {
		INum n1 = new INum(13);
		INum n2 = new INum(15);
		INum n3 = new INum(13);
		System.out.println(n1.equals(n3));
		System.out.println(n1.equals(n2));
	}
}
