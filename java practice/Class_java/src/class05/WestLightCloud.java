package class05;
import java.util.Random;

class YunSungWoo {
	public static String JikGang() {
		return "�������� ����";
	}
}

public class WestLightCloud extends YunSungWoo {
	static Random rd = new Random();
	static final int classDuration = 3*60;
	static final int initPage = 300;
	static int page = initPage;
	static int time = 0;
	public static void main(String[] args) {
		startClass();
	}
	public static void startClass() {
		int time = 0;
		System.out.println("������ �����մϴ�.");
		System.out.println("��� �����մϴ�.");
		System.out.println("��� �����ϴ�.");
		while(time != classDuration) {
			readText();
			page++;
			time++;
		}
		System.out.println("������ �����մϴ�. �ٵ� ���� ���ҽ��ϴ�.");
		System.out.println("�츮 �λ��ϰ� ��Ĩ�ô�. �ȳ���������");
		System.out.println("�ȳ���������.");
	}
	public static void readText() {
		System.out.println(page+"�� �ڵ带 �ѹ� ���ô�.");
		System.out.println("�����ΰ� ���� �մϴ�.");
		if(rd.nextBoolean())
			System.out.printf(" �� �𸣰����� %s�� ��û�ϼ���.\n", JikGang());
			if(rd.nextBoolean())
				System.out.println("  �̻��� ������ �����մϴ�.");
	}
}
