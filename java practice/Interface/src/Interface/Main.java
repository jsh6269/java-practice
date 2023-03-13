package Interface;
import java.util.Scanner;
interface Button {
	String name();
	void up();
	void down();
	void left();
	void right();
}
class TV implements Button {
	public String name() {
		return "TV";
	}
	public void up() {
		System.out.println("volume up");
	}
	public void down() {
		System.out.println("volume down");
	}
	public void left() {
		System.out.println("previous channel");
	}
	public void right() {
		System.out.println("next channel");
	}
}
class Radio implements Button {
	public String name() {
		return "Radio";
	}
	public void up() {
		System.out.println("Frequency up");
	}
	public void down() {
		System.out.println("Frequency down");
	}
	public void left() {
		System.out.println("faster speed");
	}
	public void right() {
		System.out.println("slower speed");
	}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TV tv = new TV();
		Radio radio = new Radio();
		Button Remotecon = tv;
		while(true) {
			System.out.println(" present state: " + Remotecon.name() + ", Select Button");
			System.out.print("0.End, 1.TV, 2.Video, 3.up, 4.down, 5.left, 6.right ");
			int sw = input.nextInt();
			switch (sw) {
			case 0 : System.out.println("OFF"); return;
			case 1 : Remotecon = tv; break;
			case 2 : Remotecon = radio; break;
			case 3 : Remotecon.up(); break;
			case 4 : Remotecon.down(); break;
			case 5 : Remotecon.left(); break;
			case 6 : Remotecon.right(); break;
			default : System.out.println("No button");
			}
			System.out.println();
		}
	}
}
