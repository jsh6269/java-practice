package Class2;

class Circle {
	static final double PI = 3.14;
	private double rad;
	Circle(double r){
		rad = r;
	}
	void showPerimeter() {
		System.out.println(rad * 2 * PI);
	}
	void showArea() {
		System.out.println(rad * rad * PI);
	}
}
public class CircleConstPI {
	public static void main(String[] args) {
		Circle c = new Circle(1.2);
		c.showPerimeter();
		c.showArea();
	}
}
