package inherit3;

import java.util.Scanner;

class Figure{
	static final double PI = 3.14;
	private double area;
	protected void area_cal(double x, double y) {
		area = x*y;
	}
	void setArea(double area) {
		this.area = area;
	}
	double getArea() {
		return area;
	}
}
class Circle extends Figure{
	double radius;
	Circle(double radius){
		this.radius = radius;
		setArea(PI * radius * radius);
	}
	void output() {
		System.out.printf("Circle's area : %.3f\n",getArea());
	}
}
class Triangle extends Figure{
	double base, height;
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
		setArea(0.5*base*height);
	}
	void output() {
		System.out.printf("Triangle's area : %.1f\n",getArea());
	}
}
class Rectangle extends Figure{
	double width, length;
	Rectangle(double width,double length){
		this.width = width;
		this.length = length;
		area_cal(width, length);
	}
	void output() {
		System.out.printf("Rectangle's area : %.1f\n",getArea());
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle A = new Circle(input.nextDouble());
		Triangle B = new Triangle(input.nextDouble(), input.nextDouble());
		Rectangle C = new Rectangle(input.nextDouble(), input.nextDouble());
		A.output();
		B.output();
		C.output();
	}
}