package inherit2;

import java.util.Scanner;
class Student{
	private String name;
	private int grade;
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	String get_name() {
		return name;
	}
	int get_grade() {
		return grade;
	}
}
class Score extends Student{
	private int english;
	private int math;
	Score(String name, int grade, int english, int math){
		super(name, grade);
		this.english = english;
		this.math = math;
	}
	void output() {
		System.out.println("== Score ==");
		System.out.printf("name : %s\n",get_name());
		System.out.printf("rade : %d\n",get_grade());
		System.out.printf("english : %d\n",english);
		System.out.printf("mathematics : %d\n\n",math);
	}
}
class Physical extends Student{
	private int height;
	private double weight;
	Physical(String name, int grade, int height, double weight){
		super(name, grade);
		this.height = height;
		this.weight = weight;
	}
	void output() {
		System.out.println("== Physical ==");
		System.out.printf("name : %s\n",get_name());
		System.out.printf("rade : %d\n",get_grade());
		System.out.printf("height : %d\n",height);
		System.out.printf("weight : %.1f\n",weight);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Score A = new Score(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
		A.output();
		Physical B = new Physical(input.next(), input.nextInt(), input.nextInt(), input.nextDouble());
		B.output();
	}
}