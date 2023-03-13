package innerClass;

public class Main {
	int a = 10;
	static int b = 20;
	
	static class Inner1 {
		void output() {
			System.out.println("static Inner class, b = "+b);
		}
	}
	public class Inner2 {
		void output() {
			System.out.println("member Inner class, a = "+a+", b = "+b);
		}
	}
	public static void main(String[] args) {
		Inner1 in1 = new Inner1();
		in1.output();
		System.out.println(in1.getClass().getName());
		
		Main out = new Main();
		Inner2 in2 = out.new Inner2();
		in2.output();
		System.out.println(in2.getClass().getName());
	}
}
