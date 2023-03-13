package d_printerDefault;

interface Printable {
	void print(String doc);
	default void printCMYK(String doc) {
		
	}
}
class Printer902 implements Printable {
	public void print(String doc) {
		System.out.println("Black printing");
		System.out.println(doc);
	}
	public void printCMYK(String doc) {
		System.out.println("Color printing");
		System.out.println(doc);
	}
}
public class Main {
	public static void main(String[] args) {
		Printable prn = new Printer902();
		prn.print("This is a report about...");
		System.out.println();
		prn.printCMYK("This is a report about...");
	}
}
