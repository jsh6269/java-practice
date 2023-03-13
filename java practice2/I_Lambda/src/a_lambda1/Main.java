package a_lambda1;

interface Printable {
	void print(String s);
}

public class Main {
	public static void main(String[] args) {
		
		Printable prn2 = new Printable() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn2.print("It is Anonymos class");
		
		Printable prn = s -> System.out.println(s);
		prn.print("hello");
		
		showIt(s -> System.out.println(s), "Wow Amazing");
	}
	public static void showIt(Printable prn, String s) {
		prn.print(s);
	}
}
