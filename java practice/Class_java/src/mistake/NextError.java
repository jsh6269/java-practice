package mistake;

public class NextError {
	public static void main(String[] args) {
//		-------코드--------
//		String a = input.next();
//		String b = input.nextLine();
//		System.out.print(a);
//		System.out.print(b);
	
		
//		-------입력--------
//		Hello_Suhan
//		I am high school student.
//		-------출력--------
//		Hello_Suhan
//		-------이유--------
//		input.next();는 \n직전까지 받는다. (\n은 받지 않는다.)
//		input.nextLine();는 \n을 만났으므로 종료조건이 충족되어(Line ended)
//		아무것도 입력받지 않고(\n조차도 입력받지 않는다) 프로그램이 종료된다.
	
//		input.next();       
//		: 처음으로 ' '나 '\n'를 만나기 직전까지 입력받는다.
//		input.nextInt();    
//		: 처음으로 int형 입력값이 나올때까지 입력받는다. 
//		 도중에 나타난 ' '나 '\n'은 무시되며
//		 처음 나온 int형 이후에 나오는 그 어떤 값도 ('\n', ' '포함) 입력받지 않는다. 
//		input.nextLine();
//		: 처음으로 '\n'이 나온 것 까지 입력받은 후 마지막에 입력받은 '\n'을 제거한 문자열을 반환한다. 즉, input.nextLine() 을 연속으로 써도 된다는 뜻이며 각각의 문자열을 sysp로 출력하면 모두 붙어서 나온다. 또한 input.next()나 input.nextInt()를 쓴 직후에 사용하게 되면 input.nextLine()은 씹힌다.
//		씹힌 이후에 input.nextLine()을 한번 더 적용하면 안 씹힌다.  **중요**
//		다시말해 의미없이 input.nextLine()을 써주면 OK
		
	}
}
