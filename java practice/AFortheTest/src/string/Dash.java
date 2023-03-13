package string;

public class Dash {
	public static void main(String[] args) {
		String str = "020415-3153613";
		System.out.println(str.substring(0, 6)+str.substring(7));
		
		str = "020415-3153613";
		StringBuilder str2 = new StringBuilder(str);
		str2.delete(6, 7);
		System.out.println(str2);
		
	}
}
