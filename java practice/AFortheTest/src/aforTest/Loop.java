package aforTest;

public class Loop {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++)
				System.out.print(i+" * "+j+" = "+i*j + "\n");
			System.out.println();
		}
		int LIMIT = 1500;
		int num = 1;
		int sum = 0;
		while(true) {
			if(num % 3 == 0)
				sum+=num;
			if(sum>LIMIT)
				break;
			num++;
		}
		System.out.println(num);
		System.out.println(sum);		
	}
}
