package b_wildCard;

class Box<T> {
	protected T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	public static void peekBox(Box<?> box) {
		System.out.println(box.get());
	}
}

public class Main {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("Suhan");
		Unboxer.peekBox(box);
		System.out.println(Unboxer.openBox(box));
	}
}
