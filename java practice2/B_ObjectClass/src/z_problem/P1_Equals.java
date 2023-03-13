package z_problem;

class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		return xPos == p.xPos && yPos == p.yPos;
	}
}

class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle)obj;
		return upperLeft.equals(rect.upperLeft) && lowerRight.equals(rect.lowerRight);
	}
}

public class P1_Equals {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(4, 5);
		Point p4 = new Point(3, 5);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println();
		
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(1,2,3,2);
		Rectangle r3 = new Rectangle(1,2,3,4);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
	}
}
