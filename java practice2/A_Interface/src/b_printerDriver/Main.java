package b_printerDriver;

interface Printable {
	void print(String doc);
	// public�� ���� �ʾƵ� public���� �˾Ƽ� ������. ������ ������ �� public�̶�� �ؾ��� (cannot reduce visibility)
	// interface�� ��� ������ public static final�� ����
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
