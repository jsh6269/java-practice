package naksu1;

public class Cat {
	public static void main(String[] args) {
		System.out.println("I'm cat!");
		LuLu cream = new LuLu();
		cream.sayMeow("WOOW");     // overloading                   �����ε��� ����: 1. �̸��� ����    2. �Ű������� ���� Ȥ�� ���� �ٸ���
		cream.sayMeow();
		String a = cream.sayMeow("WOEr", "meow");
		System.out.println(a);
		System.out.println(cream.sayMeow("sdf", true));
	}
	public static void sayMeow() {
		meow();
	}
	private static void meow() {
		System.out.println("meow!");
	}
}
class LuLu extends Cat{
	public static void sayMeow(String cry) {
		System.out.println(cry);
	}
//	String sayMeow(String cry) {
//		return "duplicate method Error";
//	}
	public static String sayMeow(String cry, String cry2) {
		return cry+cry2;
	}
	boolean sayMeow(String cry, boolean isCry) {
		return true;
	}
}
