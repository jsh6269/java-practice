package string;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "coffee";
		String str2 = "bread";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1.equals("coffee"));
		System.out.println(str1.compareTo("coffee"));
		System.out.println(str1.compareTo(str2)>0);
		System.out.println(str1.compareToIgnoreCase("CoffEe"));
		
		String str4 = String.valueOf(23);
		System.out.println(str4);
		
		System.out.println("______________________");
		String st1 = "Simple String";
		String st2 = "Simple String";
		String st3 = new String("Simple String");
		String st4 = new String("Simple String");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st3==st4);
		
		System.out.println("______________________");
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2,4));
		
	}
}
