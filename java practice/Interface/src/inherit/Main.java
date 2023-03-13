package inherit;
import java.util.Scanner;

interface Identity{
	void get_identity();
}
interface Department{
	void get_department();
}
// Unlike "class", multiple "interfaces" can be inherited
class Student implements Identity, Department{
	String name, school;
	int age, grade;
	Student(String name, int age, String school, int grade){
		this.name = name;
		this.age= age;
		this.school = school;
		this.grade = grade;
	}
	public void get_identity() {
		System.out.printf("Name : %s, Age : %d\n",name,age);
	}
	public void get_department() {
		System.out.printf("School : %s, Grade : %d\n",school,grade);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student A = new Student(input.next(), input.nextInt(), input.next(), input.nextInt());
		A.get_identity();
		A.get_department();
	}
}
