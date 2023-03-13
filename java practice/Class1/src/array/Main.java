package array;

import java.util.Scanner;

class Student{
	String name;
	int height;
	
	Student(){};
	Student(String n, int h){
		name = n;
		height = h;
	}
	
	void output() {
		System.out.println(name + " " + height);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] a = new Student[5];
		for(int i=0;i<5;i++)
			a[i] = new Student(input.next(), input.nextInt());
		min(a).output();
	}
	public static Student min(Student[] a) {
		Student min_data = a[0];
		for(int i=1;i<5;i++) {
			if(min_data.height>a[i].height)
				min_data = a[i];
		}
		return min_data;
	}
}