package Class;

class SinusCap {
	void sniTake() {
		System.out.println("�๰�� ����");
	}
	void sneTake() {
		System.out.println("��ä�Ⱑ ����");
	}
	void snuTake() {
		System.out.println("�ڰ� �ո�");
	}
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}
class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

public class Capsule {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}
