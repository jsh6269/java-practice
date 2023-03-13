package a_inheritance;

class Box<T> {
	protected T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		ob = o;
	}
	public SteelBox() {
	}
}

public class Main {
	public static void main(String[] args) {
		SteelBox<String> myBox1 = new SteelBox<>("wow");
		SteelBox<String> myBox2 = new SteelBox<>();
		System.out.println(myBox1.get());
		System.out.println(myBox2.get());
	}
}
