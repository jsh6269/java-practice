package class04;

public class CompareString {
	public static void main(String[] args) {
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
		cmp = st1.compareTo(st2);
		if(cmp==0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		else if(cmp<0)
			System.out.println("st1�� �� �۽��ϴ�.");
		else
			System.out.println("st2�� �� �۽��ϴ�.");
		
		if(st1.compareToIgnoreCase(st2)==0)
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�ٸ��ϴ�.");
	}
}
