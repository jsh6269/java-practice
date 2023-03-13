package interface17;

interface Printable {
	void print(String doc);
}
interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}
class Printer901 implements ColorPrintable {
	public void printCMYK(String doc) {
		System.out.println("color printing in progress");
		System.out.println(doc);
	}
	public void print(String doc) {
		System.out.println("black printing in progress");
		System.out.println(doc);
	}
}
public class C_PrintColorDriver {
	public static void main(String[] args) {
		ColorPrintable prn = new Printer901();
		String myDoc = "This is a report about...";
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}