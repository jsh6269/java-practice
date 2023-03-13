package upcasting;

class People {
	String ID;
	People(String ID){
		this.ID = ID;
	}
	void output() {
		System.out.println("People: My ID is "+ID);
	}
}
class Student extends People {
	String ID;
	int score;
	Student(String ID, String school_ID, int score){
		super(ID);
		this.ID = school_ID;
		this.score = score;
	}
	void output() {
		System.out.println("Student: My ID is "+ID+", score is "+score);
	}
}
public class Main{
	public static void main(String[] args) {
		People Peter = new People("010213");
		People Jack = new Student("020415", "2612", 100);
		Peter.output();		
		System.out.println();
		
		// Jack: upcasting, can access to the super class only
		// However, since "Jack" was made in subclass, the method overrides
		// overrided method can access to the value of subclass

		System.out.println("Jack.ID: "+Jack.ID);
		Jack.output();
		// System.out.println(Jack.score); // error
		Student Katnip = (Student) Jack;
		// Katnip: downcasting, it works as a subclass 100%
		System.out.println("Katnip.ID: "+Katnip.ID+", Katnip.score: "+Katnip.score);
		Katnip.output();
	}
}