package z_problem;

class DBox<L, R> {
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

class DDBox<U, D> {
	private U up;
	private D down;
	public void set(U u, D d) {
		up = u;
		down = d;
	}
	public String toString() {
		return up + "\n" + down;
	}
}

public class P1_twoContainer {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 3);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 5);
		System.out.println(box1);
		System.out.println(box2);
		System.out.println();
		DDBox<DBox<String, Integer>, DBox<String, Integer>> myBox = new DDBox<>();
		myBox.set(box1, box2);
		System.out.println(myBox);
	}
}
