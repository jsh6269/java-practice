package a_printableInterface;

interface Printable {
	public void print(String doc);
	// public을 쓰지 않아도 public이 된다.
}
class Printer implements Printable {
	public void print(String doc) {
		System.out.println(doc);
	}
}
public class Main {
	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("This is our first interface file");
	}
}