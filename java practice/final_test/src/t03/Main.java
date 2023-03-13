package t03;

import java.util.Scanner;
//10명의 학생 이름과 점수를 입력받아 이름과 점수, 등수를 입력받은 순서대로 출력하는 프로그램을 작성하시오.
//
//단, 출력시 "이름", "점수", "등수"는 한 칸의 공백으로 구분을 하며, Name은 4칸(%4s), Score는 5칸(%5d), Rank는 각 4칸(%4d)으로 출력한다.
//
// 
//
//* 표준입출력방식으로 작성하세요.
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] a = new String[10];
		int[] b =  new int[10];
		int[] c = {1,1,1,1,1,1,1,1,1,1};
		for(int i=0;i<10;i++) {
			a[i]=input.next();
			b[i]=input.nextInt();
		}
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				if(i!=j && b[i]<b[j])
					c[i]++;
		System.out.println("Name Score Rank");
		for(int i=0; i<10; i++)
			System.out.printf("%4s %5d %4d\n",a[i],b[i],c[i]);
	}
}