package Naksu3;

public class Main {
	public static void main(String[] args) {
		Child Suhan = new Child();
		Parent Jungchan = new Child();
		Suhan.Wow();
		Jungchan.Wow();
		
	}
}
class Parent{
	public void Wow() {
		System.out.println("개 짖는 소리 안 나게 해라!");
	}
}
class Child extends Parent{
	public void Wow() {
		System.out.println("개 짖는 소리가 안 난다!");
	}
}
