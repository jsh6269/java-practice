package c_boundWildcard;

class Box<T> {
	private T ob;
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

class Toy {
	public String toString() {
		return "I am a toy";
	}
}

class BoxHandler {
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
	}
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
