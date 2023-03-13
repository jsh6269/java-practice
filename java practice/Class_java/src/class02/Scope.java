package class02;

public class Scope {
	static int three = 3;
	public static void main(String[] args) {
		System.out.println(three);
		System.out.println("START");
		hiEveryone(12);
		System.out.println();
		hiEveryone(13);
		System.out.println("FINISH");
	}
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
	}
}
