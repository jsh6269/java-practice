package b_printerDriver;

interface Printable {
	void print(String doc);
	// public을 쓰지 않아도 public으로 알아서 생각함. 구현할 때에는 꼭 public이라고 해야함 (cannot reduce visibility)
	// interface의 모든 변수는 public static final로 간주
}

class SMPrinter implements Printable {
	public void print(String doc) {
		System.out.println("This is Samsung Printer");
		System.out.println(doc);
	}
}

class LGPrinter implements Printable {
	public void print(String doc) {
		System.out.println("This is LGPrinter");
		System.out.println(doc);
	}
}

public class Main {
	public static void main(String[] args) {
		String myDoc = "This is a report about ...";
		Printable prn1 = new SMPrinter();
		Printable prn2 = new LGPrinter();
		prn1.print(myDoc);
		System.out.println();
		prn2.print(myDoc);
	}
}
