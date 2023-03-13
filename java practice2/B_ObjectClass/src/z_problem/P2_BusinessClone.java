package z_problem;

class Business implements Cloneable {
	private String company;
	private String work;
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}

	public Business clone() throws CloneNotSupportedException {
		return (Business)(super.clone());
	}
	
	public String toString() {
		return company + " " + work;
	}
}
class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusinessInfo();
	}

	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)(super.clone());
		copy.bz = bz.clone();
		return copy;
	}
	
	public String toString() {
		return name + " " + age + " " + bz.toString();
	}
}
public class P2_BusinessClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonalInfo man = new PersonalInfo("Suhan", 19, "Djfuck", "trying");
		PersonalInfo man2 = man.clone();
		System.out.println(man.toString());
		System.out.println(man2.toString());
	}
}
