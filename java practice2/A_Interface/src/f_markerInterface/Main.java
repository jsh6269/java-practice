package f_markerInterface;

interface Lower {}
interface Upper {}

interface Printable {
	String getContents();
}
class Report implements Printable, Upper {
	String cons;
	Report(String cons){
		this.cons = cons;
	}
	public String getContents() {
		return cons;
	}
}
class Printer {
	public void printContents(Printable doc) {
		if(doc instanceof Lower)
			System.out.println((doc.getContents()).toLowerCase());
		else if(doc instanceof Upper)
			System.out.println((doc.getContents()).toUpperCase());
		else
			System.out.println(doc.getContents());
	}
}
public class Main {
	public static void main(String[] args) {
		Printer prn = new Printer();
		Report doc = new Report("This is simple");
		prn.printContents(doc);
	}
}