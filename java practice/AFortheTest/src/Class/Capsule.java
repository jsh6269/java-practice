package Class;

class SinusCap {
	void sniTake() {
		System.out.println("Äà¹°ÀÌ ¸ÜÀ½");
	}
	void sneTake() {
		System.out.println("ÀçÃ¤±â°¡ ¸ÜÀ½");
	}
	void snuTake() {
		System.out.println("ÄÚ°¡ ¶Õ¸²");
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
