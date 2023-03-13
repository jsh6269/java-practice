package f_GetableGenericInterface;

interface Getable<T> {
	public T get();
}

class Toy {
	public String toString() {
		return "I am a Toy";
	}
}

class Box<T> implements Getable<T> {
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
		Box<Toy> box = new Box<>();
		box.set(new Toy());
		Getable<Toy> box2 = box;
		System.out.println(box2.get());
	}
}
