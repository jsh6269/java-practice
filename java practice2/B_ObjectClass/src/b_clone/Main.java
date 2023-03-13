package b_clone;

class Point implements Cloneable {
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setVal(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException{
		Point p1 = new Point(3, 5);
		Point p2 = (Point)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
		
		p1.setVal(4, 7);
		System.out.println(p1);
		System.out.println(p2);
	}
}
