package z_problem;

class DBox2<L, R> {
	private L left;
	private R right;
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}

public class P2_twoContainer {
	public static void main(String[] args) {
		DBox2<String, Integer> box1 = new DBox2<>();
		box1.set("Apple", 3);
		DBox2<String, Integer> box2 = new DBox2<>();
		box2.set("Orange", 5);
		DBox2<DBox2<String, Integer>, DBox2<String, Integer>> myBox = new DBox2<>();
		myBox.set(box1, box2);
		System.out.println(myBox);
	}
}
