package Class;
class SinivelCap {
	void take() {
		System.out.println("�๰�� ����");
	}
}
class SneezeCap {
	void take() {
		System.out.println("��ä�Ⱑ ����");
	}
}
class SnuffleCap {
	void take() {
		System.out.println("�ڰ� �ո�");
	}
}
class SinusCap {
	SinivelCap siCap = new SinivelCap();
	SneezeCap szCap = new SneezeCap();
	SnuffleCap sfCap = new SnuffleCap();
	
	void take() {
		siCap.take();
		szCap.take();
		sfCap.take();
	}
}
class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}
public class Capsule2 {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}
