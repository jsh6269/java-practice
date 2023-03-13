package c_boxOverIt;

class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(42);
		Box<Box<Integer>> box2 = new Box<>();
		box2.set(box1);
		Box<Box<Box<Integer>>> box3 = new Box<>();
		box3.set(box2);
		
		System.out.println(box3.get().get().get());
	}
}
