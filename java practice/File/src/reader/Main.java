package reader;

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		ex01();
		ex02();
	}
	public static void ex01() throws IOException {
		// char 배열을 이용해 읽고 출력하고 쓸 수 있음
		Reader in = new FileReader("input.txt");
		Writer out = new FileWriter("output.txt");
		char[] cbuf = new char[500];
		in.read(cbuf);
		System.out.println(cbuf);
		out.write(cbuf);
		in.close();
		out.close();	
	}
	public static void ex02() throws IOException {
		// String도 가능함
		Writer out = new FileWriter("output.txt");
		out.write("What the fuck!\n");
		out.write("holly shit!\n");
		out.write("i-ing atsalamalaicum!");
		out.close();
	}
}