package e_finalClone;

class Point implements Cloneable{
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void changePos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public Point clone() throws CloneNotSupportedException {
		return (Point)(super.clone());
	}
}

class Rectangle implements Cloneable {
	private Point upperLeft;
	private Point lowerRight;
	
	Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	public String toString() {
		return "[" + upperLeft.toString() + ", " + lowerRight.toString() + "]";
	}
	
	public Rectangle clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle)(super.clone());
		copy.upperLeft = upperLeft.clone();
		copy.lowerRight = lowerRight.clone();
		return copy;
	}
	
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle r1 = new Rectangle(3, 4, 5, 6);
		Rectangle r2 = (Rectangle)(r1.clone());
		r1.changePos(1, 2, 3, 4);
		System.out.println(r1);
		System.out.println(r2);
	}
}
