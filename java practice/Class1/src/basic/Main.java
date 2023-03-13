package basic;

import java.util.Scanner;

class Data{
	String name;
	int korean;
	int english;
	
	Data(String n, int k, int e){
		name = n;
		korean = k;
		english = e;
	}
	
	void output() {
		System.out.printf("%s %d %d\n",name, korean, english);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Data A = new Data(input.next(),input.nextInt(),input.nextInt());
		Data B = new Data(input.next(),input.nextInt(),input.nextInt());
		A.output();
		B.output();
		System.out.printf("avg %d %d", (A.korean+B.korean)/2, (A.english+B.english)/2);
	}
}