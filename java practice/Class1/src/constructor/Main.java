package constructor;

import java.util.Scanner;

class Time{
	private int hour, min, sec;
	private String what;
	Time(){
		this(0,0,0);
		what = "Midnight";
	}
	Time(int h){
		this(h,0,0);
		what = "Sharp";
	}
	Time(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		what = "Specific";
	}
	void output() {
		System.out.print(what+" -> ");
		System.out.printf("hour : %d, minute : %d, second : %d",hour,min,sec);
		System.out.println();
	}
}
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Time A = new Time();
		Time B = new Time(input.nextInt());
		Time C = new Time(input.nextInt(),input.nextInt(),input.nextInt());
		A.output();
		B.output();
		C.output();
	}
	
}