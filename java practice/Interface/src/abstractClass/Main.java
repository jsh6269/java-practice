package abstractClass;
import java.util.Scanner;
abstract class Figure {
	static final double PI = 3.14;
	double area;
	abstract void area();
	abstract void output();
}
class Circle extends Figure {
	double radius;
	Circle(double radius){
		this.radius = radius;
		area();
	}
	void area() {
		area = PI * radius * radius;
	}
	void output() {
		System.out.printf("Area of Circle : %.2f\n", area);
	}
}
class Rect extends Figure {
	double r,c;
	Rect(double r, double c){
		this.r = r;
		this.c = c;
		area();
	}
	void area() {
		area = r * c;
	}
	void output() {
		System.out.printf("Area of Rectangle : %.2f\n", area);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Figure[] fig = new Figure[9999];
		for(int i=0; ;i++) {
			System.out.print("0.End, 1.Circle, 2.Rectangle, input = ? ");
			int key;
			try {key = input.nextInt(); }
			catch(Exception e){
				System.out.println("Invalid input data! Process ended.");
				return;
			}
			switch(key) {
			case 0:
				System.out.println("Process ended!");
				return;
			case 1:
				System.out.print("Input radius: ");
				try {fig[i] = new Circle(input.nextDouble()); }
				catch(Exception e) {
					System.out.println("Invalid input data! Process ended.");
					return;
				}
				fig[i].output();
				break;
			case 2:
				System.out.print("Input base, height: ");
				try {fig[i] = new Rect(input.nextDouble(),input.nextDouble()); }
				catch(Exception e){
					System.out.println("Invalid input data! Process ended.");
					return;
				}
				fig[i].output();
				break;
			default:
				System.out.print("Input out of range!\n");
			}
			System.out.println("------------------------------");
		}
	}
}
