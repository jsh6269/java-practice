package class04;

public class RemoveHypen {
	public static void main(String[] args) {
		String str1 = "990925-1012999";
//		System.out.println(str1.replace('-', ' '));
		System.out.println(str1.substring(0, 6)+' '+str1.substring(7));
	}
}
