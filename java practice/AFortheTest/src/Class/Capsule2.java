package Class;
class SinivelCap {
	void take() {
		System.out.println("ƒ‡π∞¿Ã ∏‹¿Ω");
	}
}
class SneezeCap {
	void take() {
		System.out.println("¿Á√§±‚∞° ∏‹¿Ω");
	}
}
class SnuffleCap {
	void take() {
		System.out.println("ƒ⁄∞° ∂’∏≤");
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
