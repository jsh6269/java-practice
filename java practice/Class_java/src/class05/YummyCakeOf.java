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
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");
		}
		if(cake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스 \n");
		}
		if(cake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스 \n");
		}
		
		System.out.println("---------------------");
		
		if(cheesecake instanceof Cake) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");
		}
		if(cheesecake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스 \n");
		}
		if(cheesecake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스 \n");
		}

		System.out.println("---------------------");
		
		if(strawberrycheesecake instanceof Cake) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");
		}
		if(strawberrycheesecake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스 \n");
		}
		if(strawberrycheesecake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스 \n");
		}

	}
}
