package mistake;

public class Mistake {
	public static void main(String[] args) {
		// System.out.println("current num: ", num);  => "current num: " + num 으로 고쳐야 한다!!!
		// True False가 아니라 true false이다 !!!
		// 상당히 많은 정수형의 연산들이 기본적으로 int형으로 계산한다. short나 byte의 비트연산자, 사칙연산 등
		// 그리고 생각지도 못했던 연산들이 int형을 기본으로 하는 경우가 많으므로 이에 대한 내용은 꼼꼼히 살펴야 한다.
		// +=, *=. /= 등은 기본적으로 형을 유지시킨다.

		//		int a = 4;
//		a*=5.3;
//		System.out.println(a);  // 21
		
		// 따라서 char형은 ++, += 모두 되지만 a = a + 1 처럼 풀어쓸 수 없음을 명심하라!!!
		
		// str.length(), arr.length   각각 인스턴스 메소드, 인스턴스 변수임에 유의!!!
		
		// for(int i=1; i<=10; i++) {          => :을 찍지 않는다!!!
		//   ...
		// }
		// 반복문의 중괄호를 빼먹지 마라!!!
		// switch case 문에서 특별한 의도가 없으면 break를 빼먹지 마라!!!
		// 비트연산자의 계산은 기본적으로 int형으로 계산되기 때문에 결과가 int형이 됨을 명심해라!!!
		// static method는 외부의 non-static field에 존재하는 변수나 메소드를 참조할 수 없다!!!
		// and, not, or 가 아니라 &&, !, ||이다. !의 경우 boolean형에만 사용할 수 있는 것 같다!!!
		// 조건문에 boolean형이 아닌 변수를  단독으로 써서 true false를 판별하는 것은 불가능 한 듯 하다!!!
		// 세미클론 빼먹지 마라!!!
		// do while문에서는 while(조건); 로 세미클론을 써야함을 명심하라!!!
		// nextLine이 씹히지는 않는지 생각하라!!!
		// 부모 클래스의 생성자가 항상 먼저 호출됨을 명심하라!!!
		// 정수형 리터럴이 int형의 범위를 벗어나지는 않는지 유의하라!!!
		// 한 클래스 파일에는 public class가 1개만 가능하고 소스 파일명과 같아야한다!!!
		// 인터페이스의 모든 추상 메소드는 public이다. 접근수준지시자를 생략해도 알아서 public으로 간주한다!!
		// 물론 인터페이스에는 default 메소드를 둘 수 있다. 다만 '추상'메소드는 public이라는 뜻이다.
		// 인터페이스 내의 모든 변수는 선언하지 않아도 항상 public static final로 간주한다.
		// 언제나 인터페이스를 구현하는 모든 클래스는 인터페이스의 모든 추상메소드를 구현해야한다.
		
	}
}
