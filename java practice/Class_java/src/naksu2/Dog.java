package naksu2;

public class Dog extends naksu1.Cat {
	public static void main(String[] args) {
		naksu1.Cat myCat = new naksu1.Cat();
		myCat.sayMeow();
		System.out.println("program finished");
		
		Puppy Happy = new Puppy();
		Happy.bark(); // walfwalf                             오버라이딩의 조건: 1. 이름이 같다    2. 매개변수의 수와 형이 모두 같다  3. 반환형이 같다
		Happy.barking();                                     // 오버라이딩으로 접근수준을 좁힐 수 없다. nonstatic이여야한다.
	}
	public static String bark() {
		System.out.println("walwal");
		return "WalWal";
	}
	protected String barking() {
		System.out.println("dog is barking");
		return "개 짖는 소리 좀 안나게 해라";
	}
}
class Puppy extends Dog{
	public static String bark() {
		System.out.println("walfwalf");
		return "walfwalf";
	}
//	public static boolean barking() {                     // 매개변수의 수와 형이 같으므로 오버로딩의 대상이 아니다. 반환형이 다르므로 오버라이딩의 대상이 아니다.
//		System.out.println("puppy is barking");             // Error가 발생한다.
//		return true;
//	}
	public String barking() {          // cannot reduce visibility of the inherited method
		System.out.println("puppy is barking")
		return "Ok";            // nonstatic method cannot override static method
		                        // static method cannot hide the nonstatic method
	}
}

