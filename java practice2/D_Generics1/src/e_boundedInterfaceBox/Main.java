package e_boundedInterfaceBox;

interface Eatable {
	void eat();
}

class Apple implements Eatable {
	public void eat() {
		System.out.println("It tastes good!");
	}
	public String toString() {
		return "I am an apple";
	}
}

class Box<T extends Eatable> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		ob.eat();
		return ob;
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Apple> box = new Box<>();
		box.set(new Apple());
		Apple ap = box.get();
		System.out.println(ap);
	}
}
