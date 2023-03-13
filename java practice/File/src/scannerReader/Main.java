package scannerReader;
import java.io.*;
import java.util.Scanner;
class Teacher{
	private String name;
	private int age;
	private int num;
	private String phone;
	Teacher(String name, int age, int num, String phone){
		this.name = name;
		this.age = age;
		this.num = num;
		this.phone = phone;
	}
	void output() {
		System.out.printf("%s %d %d %s\n",name,age,num,phone);
	}
	void fileout() throws IOException{
		PrintWriter out = new PrintWriter(new BufferedWriter
				(new FileWriter("output4.txt", true)));
		// true로 설정시 덮어쓰지 않고 내용이 추가됨
		out.printf("%s %d %d %s\n", name,age,num,phone);
		out.close();
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new BufferedReader
								(new FileReader("input4.txt")));
		Teacher A = new Teacher(in.next(), in.nextInt(), in.nextInt(),in.next());
		Teacher B = new Teacher(in.next(), in.nextInt(), in.nextInt(),in.next());
		in.close();
		A.output();
		B.output();
		A.fileout();
		B.fileout();
	}
}
