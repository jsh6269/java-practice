package Class;

class InstCnt {
	static int instNum = 0;
	InstCnt() {
		instNum++;
		System.out.println("�ν��Ͻ� ����:" + instNum);
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		cnt1.instNum -= 3;
		InstCnt cnt4 = new InstCnt();
	}
}
