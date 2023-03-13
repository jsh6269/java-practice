package inherit;

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
		System.out.printf("name : %s\n",get_name());
		System.out.printf("grade : %d\n",get_grade());
		System.out.printf("english : %d\n",english);
		System.out.printf("mathematics : %d\n",math);
		System.out.printf("sum : %d",english+math);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Score A = new Score(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
		A.output();
	}
}
