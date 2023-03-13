package interface17;

interface Lower {}
interface Upper {}

interface fPrintable {
	String getContents();
}
class Report implements fPrintable {
	String cons;
	Report(String cons){
		this.cons = cons;
	}
	public String getContents() {
		return cons;
	}
}
class fPrinter {
	public void printContents(fPrintable doc) {
		if(doc instanceof Lower)
			System.out.println((doc.getContents()).toLowerCase());
		else if(doc instanceof Upper)
			System.out.println((doc.getContents()).toUpperCase());
		else
			System.out.println(doc.getContents());
	}
}
public class F_MarkerInterface {
	public static void main(String[] args) {
		fPrinter prn = new fPrinter();
		Report doc = new Report("This is simple");
		prn.printContents(doc);
	}
}
