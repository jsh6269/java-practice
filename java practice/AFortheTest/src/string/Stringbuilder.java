package string;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");
		stbuf.append(12345);
		stbuf.append(true);
		stbuf.append("hello");
		stbuf.append('c');
		System.out.println(stbuf);
		
		stbuf.delete(6, 10);
		System.out.println(stbuf);
		stbuf.insert(3, "WHAT");
		System.out.println(stbuf);
		stbuf.replace(1, 17, "Replaced");
		System.out.println(stbuf);
		stbuf.reverse();
		System.out.println(stbuf);
		
		String result = stbuf.toString();
		
	}
}
