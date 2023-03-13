package e_instanceofInterface;

interface Printable {
	void print(String doc);
}
class Printer1 implements Printable {
	public void print(String doc) {
		System.out.println(doc);
	}
}
class Printer2 extends Printer1 {
	public void print(String doc) {
		System.out.println("NEW LAYER");
		System.out.println(doc);
	}
}
public class Main {
	public static void main(String[] args) {
		Printable prn = new Printer1();
		prn.print("This is a report");
		System.out.println();
		
		Printable prn2 = new Printer2();
		prn2.print("This is a report");
	}
}