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
		System.out.println("�� ¢�� �Ҹ� �� ���� �ض�!");
	}
}
class Child extends Parent{
	public void Wow() {
		System.out.println("�� ¢�� �Ҹ��� �� ����!");
	}
}
