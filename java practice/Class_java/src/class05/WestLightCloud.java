package class05;
import java.util.Random;

class YunSungWoo {
	public static String JikGang() {
		return "윤성우의 직강";
	}
}

public class WestLightCloud extends YunSungWoo {
	static Random rd = new Random();
	static final int classDuration = 3*60;
	static final int initPage = 300;
	static int page = initPage;
	static int time = 0;
	public static void main(String[] args) {
		startClass();
	}
	public static void startClass() {
		int time = 0;
		System.out.println("수업을 시작합니다.");
		System.out.println("퀴즈를 시작합니다.");
		System.out.println("퀴즈를 끝냅니다.");
		while(time != classDuration) {
			readText();
			page++;
			time++;
		}
		System.out.println("수업을 종료합니다. 다들 수고 많았습니다.");
		System.out.println("우리 인사하고 마칩시다. 안녕히가세요");
		System.out.println("안녕히가세요.");
	}
	public static void readText() {
		System.out.println(page+"의 코드를 한번 봅시다.");
		System.out.println("무엇인가 말을 합니다.");
		if(rd.nextBoolean())
			System.out.printf(" 잘 모르겠으면 %s를 시청하세요.\n", JikGang());
			if(rd.nextBoolean())
				System.out.println("  이상한 비유를 제시합니다.");
	}
}
