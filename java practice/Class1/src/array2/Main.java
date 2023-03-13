package array2;

import java.util.Scanner;

class Student{
	String name;
	int height;
	double weight;
	
	Student(){};
	Student(String n, int h, double w){
		name = n;
		height = h;
		weight = w;
	}
	
	void output() {
		System.out.printf("%s %d %.1f\n",name,height,weight);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] a = new Student[5];
		for(int i=0;i<5;i++)
			a[i] = new Student(input.next(), input.nextInt(), input.nextDouble());
		System.out.println("name");
		sort(a, "name");
		System.out.println();
		System.out.println("weight");
		sort(a, "weight");
	}
	public static void sort(Student[] a, String cmp) {
		for(int i=0;i<5;i++) {
			int min = i;
			for(int j=i+1;j<5;j++) {
				if(cmp.equals("name") && a[min].name.compareTo(a[j].name)>0)
					min = j;
				else if(cmp.equals("weight") && a[min].weight<a[j].weight)
					min = j;
			}
			Student temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for(int i=0;i<5;i++)
			a[i].output();
	}
}