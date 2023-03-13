package builtInOverride;

import java.util.Scanner;

class Data{
	String name;
	int height;
	double weight;
	Data(String name, int height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public boolean equals(Data A) {
		return (height==A.height)&&(weight==A.weight);
	}
	public String toString() {
		return name+"'s body : "+height+"cm, "+weight+"kg";
	}
	String get() {
		return name+"'s body";
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Data A = new Data(input.next(),input.nextInt(),input.nextDouble());
		Data B = new Data(input.next(),input.nextInt(),input.nextDouble());
		System.out.println("Body.Student");
		System.out.println(A.toString());
		System.out.printf("%s",A.equals(B) ? A.get()+" == "+B.get() : A.get()+" != "+B.get());
	}
}
