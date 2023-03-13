package inheritence;

class MobilePhone {
	private String telNum;
	public MobilePhone(String tel) {
		telNum = tel;
	}
	public void ring() {
		System.out.println(telNum + " is ringing!");
	}
}
class SmartPhone extends MobilePhone {
	private String androidVer;
	public SmartPhone(String tel, String ver) {
		super(tel);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running on " + androidVer);
	}
}
public class Phone {
	public static void main(String[] args) {
		MobilePhone 
	}
}
