package class04;

public class CompareString {
	public static void main(String[] args) {
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
		
		cmp = st1.compareTo(st2);
		if(cmp==0)
			System.out.println("두 문자열은 일치합니다.");
		else if(cmp<0)
			System.out.println("st1이 더 작습니다.");
		else
			System.out.println("st2가 더 작습니다.");
		
		if(st1.compareToIgnoreCase(st2)==0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("다릅니다.");
	}
}
