package Class2;

class Friend {
	protected String name;
	protected String phone;
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	public void tellYourInfo() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
	}
}
class UnivFriend extends Friend {
	private String major;
	public UnivFriend(String na, String ph, String maj) {
		super(na, ph);
		major = maj;
	}
	public void tellYourInfo() {
		super.tellYourInfo();
		System.out.println("전공 : "+major);
	}
}
class CompFriend extends Friend {
	private String department;
	public CompFriend(String na, String ph, String dep) {
		super(na, ph);
		department = dep;
	}
	public void tellYourInfo() {
		super.tellYourInfo();
		System.out.println("부서  : "+department);
	}
}
public class MyFriend {
	public static void main(String[] args) {
		int cnt = 0;
		Friend[] myFriend = new Friend[3];
		myFriend[cnt++] = new Friend("fuck", "010-203-401");
		myFriend[cnt++] = new UnivFriend("jungchan", "010-2320-142", "biology");
		myFriend[cnt++] = new CompFriend("wers", "010-2532-12546", "C++");
		for(int i=0; i<3; i++) {
			myFriend[i].tellYourInfo();
			System.out.println();
		}
	}
}
