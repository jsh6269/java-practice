package interface17;

interface Printable3 {
	void print(String doc);
	default void printCMYK(String doc) {
		
	}
}
class Printer902 implements Printable3 {
	public void print(String doc) {
		System.out.println("Black printing");
		System.out.println(doc);
	}
	public void printCMYK(String doc) {
		System.out.println("Color printing");
		System.out.println(doc);
	}
}
public class D_PrinterDefault {
	public static void main(String[] args) {
		Printable3 prn = new Printer902();
		prn.print("This is a report about...");
		System.out.println();
		prn.printCMYK("This is a report about...");
	}
}
