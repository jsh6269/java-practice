package naksu2;

public class Dog extends naksu1.Cat {
	public static void main(String[] args) {
		naksu1.Cat myCat = new naksu1.Cat();
		myCat.sayMeow();
		System.out.println("program finished");
		
		Puppy Happy = new Puppy();
		Happy.bark(); // walfwalf                             �������̵��� ����: 1. �̸��� ����    2. �Ű������� ���� ���� ��� ����  3. ��ȯ���� ����
		Happy.barking();                                     // �������̵����� ���ټ����� ���� �� ����. nonstatic�̿����Ѵ�.
	}
	public static String bark() {
		System.out.println("walwal");
		return "WalWal";
	}
	protected String barking() {
		System.out.println("dog is barking");
		return "�� ¢�� �Ҹ� �� �ȳ��� �ض�";
	}
}
class Puppy extends Dog{
	public static String bark() {
		System.out.println("walfwalf");
		return "walfwalf";
	}
//	public static boolean barking() {                     // �Ű������� ���� ���� �����Ƿ� �����ε��� ����� �ƴϴ�. ��ȯ���� �ٸ��Ƿ� �������̵��� ����� �ƴϴ�.
//		System.out.println("puppy is barking");             // Error�� �߻��Ѵ�.
//		return true;
//	}
	public String barking() {          // cannot reduce visibility of the inherited method
		System.out.println("puppy is barking")
		return "Ok";            // nonstatic method cannot override static method
		                        // static method cannot hide the nonstatic method
	}
}

