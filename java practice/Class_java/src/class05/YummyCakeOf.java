package class05;

class Cake{
	
}
class CheeseCake extends Cake{
	
}
class StrawberryCheeseCake extends CheeseCake{
	
}
public class YummyCakeOf {
	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();
		CheeseCake cheesecake = new StrawberryCheeseCake();		
		StrawberryCheeseCake strawberrycheesecake = new StrawberryCheeseCake();		
		
		
		if(cake instanceof Cake) {
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof CheeseCake) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		
		System.out.println("---------------------");
		
		if(cheesecake instanceof Cake) {
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");
		}
		if(cheesecake instanceof CheeseCake) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		if(cheesecake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ� \n");
		}

		System.out.println("---------------------");
		
		if(strawberrycheesecake instanceof Cake) {
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");
		}
		if(strawberrycheesecake instanceof CheeseCake) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		if(strawberrycheesecake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ� \n");
		}

	}
}
