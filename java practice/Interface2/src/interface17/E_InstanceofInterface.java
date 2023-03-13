package interface17;

interface iPrintable {
	void print(String doc);
}
class iPrinter1 implements iPrintable {
	public void print(String doc) {
		System.out.println(doc);
	}
}
class iPrinter2 extends iPrinter1 {
	public void print(String doc) {
		System.out.println("NEW LAYER");
		System.out.println(doc);
	}
}
public class E_InstanceofInterface {
	public static void main(String[] args) {
		iPrintable prn = new iPrinter1();
		prn.print("This is a report");
		System.out.println();
		
		iPrintable prn2 = new iPrinter2();
		prn2.print("This is a report");
	}
}
