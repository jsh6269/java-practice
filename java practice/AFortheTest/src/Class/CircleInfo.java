package Class;

class Point {
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}
}
class Circle2 {
	Point center;
	int rad;
	public Circle2(int x, int y, int r) {
		center = new Point(x, y);
		rad = r;
	}
	public void showCircleInfo() {
		System.out.print("중심 :");
		center.showPointInfo();
		System.out.println("반지름 : "+rad);
	}
}
public class CircleInfo {
	public static void main(String[] args) {
		Circle2 c = new Circle2(2, 2, 4);
		c.showCircleInfo();
	}
}
