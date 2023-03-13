package class05;

class Boxx {
	public void wrapIt() {                             // static 쓰면 절대 안됨!!!
		System.out.println("Simple Wrapping");
	}
}
class PaperBoxx extends Boxx {
	public void wrapIt() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBoxx extends PaperBoxx {
	public void wrapIt() {
		System.out.println("Gold Wrapping");
	}
}

public class P15_1 {
	public static void main(String[] args) {
		Boxx box1 = new Boxx();
		PaperBoxx box2 = new PaperBoxx();
		GoldPaperBoxx box3 = new GoldPaperBoxx();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	public static void wrapBox(Boxx box) {
		box.wrapIt();
	}
}
