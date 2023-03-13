package e_boxMaker;

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

class Boxer {
	public static <T> Box<T> makeBox(T o) {
		Box<T> myBox = new Box<>();
		myBox.set(o);
		return myBox;
	}
}

class UnBoxer {
	public static <T> T unBox(Box<T> myBox) {
		return myBox.get();
	}
}

public class Main {
	public static void main(String[] args) {
		Box<String> box1 = Boxer.makeBox("this is good");
		System.out.println(box1);
		
		String str = UnBoxer.unBox(box1);
		System.out.println(str);
	}
}
