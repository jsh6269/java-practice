package a_equals;

public class StringEquality {
	public static void main(String[] args) {
		String str1 = new String("Aha");
		String str2 = new String("Aha");
		String str3 = new String("Bha");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
