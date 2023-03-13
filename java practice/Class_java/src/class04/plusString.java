package class04;

public class plusString {
	public static void main(String[] args) {
		String str = "age: " + 17;
		System.out.println(str);
//		String str2 = "age: ".concat(17);
//			=> complie error, concat은 string을 인자로 받음
		String str3 = "age: ".concat("17");
		System.out.println(str3);
		
		String str4 = "age: ".concat(String.valueOf(17));
		System.out.println(str4);
	}
}
