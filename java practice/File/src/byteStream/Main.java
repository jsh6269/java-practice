package byteStream;

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		ex00();
		ex01();
		ex02();
	}
	public static void ex00() throws IOException {
		// input.txt의 내용을 출력하고 output.txt로 복사한다.
		InputStream in = new FileInputStream("input.txt");
		OutputStream out = new FileOutputStream("output.txt");
		int a;
		while((a=in.read())!=-1) {
			System.out.print((char)a);
			out.write(a);
		}
		in.close();
		out.close();
	}
	public static void ex01() throws IOException {
		// 정수 유니코드를 Byte 단위로 읽어옴 
		OutputStream out = new FileOutputStream("output2.txt");
		for(int i=14;i<127;i++) {
			out.write(i);
		}
		out.close();
	}
	public static void ex02() throws IOException {
		// getBytes 메소드를 이용해 원하는 문장을 작성할 수 있음
		OutputStream out = new FileOutputStream("C:\\Users\\sj\\Desktop\\java practice\\File\\output3.txt");
		String str = "rock and roll!\nlet's go!";
		out.write(str.getBytes());
		out.close();		
	}
}