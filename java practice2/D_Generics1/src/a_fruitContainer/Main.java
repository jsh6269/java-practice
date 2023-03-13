package a_fruitContainer;

class Apple { 
	public String toString() {
		return "I am Apple";
	}
}

class Orange { 
	public String toString() {
		return "I am Orange";
	}
}

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
		Box<Apple> appleBox = new Box<>();
		Box<Orange> orangeBox = new Box<>();
		appleBox.set(new Apple());
		orangeBox.set(new Orange());
		
		Apple ap = appleBox.get();
		System.out.println(ap);
		System.out.println();
		
		System.out.println(appleBox.get());
		System.out.println(orangeBox.get());
	}
}
