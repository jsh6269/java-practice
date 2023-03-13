package z_problem;

class Business2 implements Cloneable {
	private String company;
	private String work;
	public Business2(String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusiness2Info() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return company + " " + work;
	}
}
class PersonalInfo2 implements Cloneable {
	private String name;
	private int age;
	private Business2 bz;
	public PersonalInfo2(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business2(company, work);
	}
	public void showPersonalInfo2() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusiness2Info();
	}

	public Object clone() throws CloneNotSupportedException {
		PersonalInfo2 copy = (PersonalInfo2)(super.clone());
		copy.bz = (Business2)(bz.clone());
		return copy;
	}
	
	public String toString() {
		return name + " " + age + " " + bz.toString();
	}
}
public class P3_BusinessClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonalInfo2 man = new PersonalInfo2("Suhan", 19, "Djfuck", "trying");
		PersonalInfo2 man2 = (PersonalInfo2)(man.clone());
		System.out.println(man.toString());
		System.out.println(man2.toString());
	}
}
