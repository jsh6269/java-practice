package f_boxMaker;

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
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> myBox = new Box<>();
		System.out.println("boxing data: " + o.intValue());
		myBox.set(o);
		return myBox;
	}
}

class UnBoxer {
	public static <T extends Number> T unBox(Box<T> myBox) {
		System.out.println("unboxed data: " + myBox.get().intValue());
		return myBox.get();
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Double> box1 = Boxer.makeBox(3.125);
		System.out.println(box1);
		
		Double d = UnBoxer.unBox(box1);
		System.out.println(d);
	}
}
