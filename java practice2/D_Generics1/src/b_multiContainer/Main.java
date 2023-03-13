package b_multiContainer;

class Box<L, R> {
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	public String toString() {
		return left + " & " + right;
	}
}
public class Main {
	public static void main(String[] args) {
		Box<String, Integer> box = new Box<>();
		box.set("haha", 5);
		System.out.println(box);
	}
}
