package staticVar;

import java.util.Scanner;

class Student{
	static int num=0;
	private String name;
	private int score;
	private boolean ispassed;
	
	Student(){}
	Student(String name, int score){
		this.name = name;
		this.score = score;
		if(this.score >= 80) {
			num++;
			ispassed = true;
		}
	}
	void get_name(){
		if(ispassed == true)
			System.out.println(name);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] a = new Student[5];
		for(int i=0;i<5;i++)
			a[i] = new Student(input.next(), input.nextInt());
		System.out.printf("Passed number : %d\n", Student.num);
		for(int i=0;i<5;i++)
			a[i].get_name();
	}
}
