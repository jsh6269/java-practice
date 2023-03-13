package e_inOutGeneric;

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
	public static <T> void inBox(Box<? super T> box, T n) {
		box.set(n);
	}
	public static <T> T outBox(Box<? extends T> box) {
		System.out.println(box.get());
		return box.get();
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Toy> myBox = new Box<>();
		BoxHandler.inBox(myBox, new Toy());
		Toy t = BoxHandler.outBox(myBox);
		System.out.println(t);
	}
}
