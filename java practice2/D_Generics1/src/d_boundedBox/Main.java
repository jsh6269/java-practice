package d_boundedBox;

class Box<T extends Number> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() {
		return ob.intValue();
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
		box1.set(32);
		box2.set(23.15);
		double b = box2.get();
		System.out.println(b);
		System.out.println(box2.toIntValue());
	}
}
