package d_moveBoxContent;

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
class Robot {
	public String toString() {
		return "I am a robot";
	}
}

class BoxHandler {
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
	}
	public static <T> void moveIt(Box<T> to, Box<T> from) {
		to.set(from.get());
		// 코드의 실수를 잡아내지 못함
	}
	public static <T> void moveThat(Box<? super T> to, Box<? extends T> from) {
		to.set(from.get());
	}
}

public class Main {
	public static void main(String[] args) {
		Box<Toy> box1 = new Box<>();
		Box<Toy> box2 = new Box<>();
		box2.set(new Toy());
		BoxHandler.moveBox(box1, box2);
		System.out.println(box1);

		Box<Toy> box3 = new Box<>();
		BoxHandler.moveBox(box3, box2);
		System.out.println(box3);

		Box<Toy> box4 = new Box<>();
		BoxHandler.moveThat(box4, box2);
		System.out.println(box4);

		Box<Robot> box6 = new Box<>();
		box6.set(new Robot());
		Box<Robot> box5 = new Box<>();
		BoxHandler.moveThat(box5, box6);
		System.out.println(box5);
	}
}
