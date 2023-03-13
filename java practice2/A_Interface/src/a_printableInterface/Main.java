package a_printableInterface;

interface Printable {
	public void print(String doc);
	// public�� ���� �ʾƵ� public�� �ȴ�.
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