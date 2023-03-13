package project;

import java.util.Scanner;

class Taxi{
	static int tank = 1000;
	static int cnt = 0;
	private int num, fuel;
	Taxi() {
		this(70);
	}
	Taxi(int fuel) {
		num = cnt;
		setFuel(fuel);
	}
	void setFuel(int fuel) {
		if(fuel>70)
			fuel = 70;
		this.fuel = fuel;
	}
	void run(int fuel) {
		if(this.fuel < fuel)
			this.fuel = 0;
		else
			this.fuel -= fuel;
	}
	void refuel(int fuel) {
		if(this.fuel + fuel > 70)
			fuel = 70-this.fuel;
		if(tank < fuel)
			fuel = tank;
		this.fuel += fuel;
		tank -= fuel;
	}
	static void getTank() {
		System.out.printf("Tank liters : %d\n", tank);
	}
	static int getNum() {
		cnt++;
		return cnt;
	}
	void getFuel() {
		System.out.printf("Taxi number : %d, fuel liters : %d\n",num,fuel);
	}
}

public class Main {
	static Taxi[] myTaxi = new Taxi[51];
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean end = false;
		while(true) {
			System.out.print("0. end, 1. taxi_add, 2. taxi_run, 3. taxi_fueladd ");
			int n = input.nextInt();
			switch(n) {
			case 1:
				add_taxi();
				System.out.println();
				break;
			case 2:
				run_taxi();
				System.out.println();
				break;
			case 3:
				add_fuel();
				System.out.println();
				break;
			default:
				end = true;
			}
			if(end == true)
				break;
		}
		System.out.println("END!");
	}
	static void add_taxi() {
		System.out.print("First fuel? (full = 0) ");
		int temp = input.nextInt();
		int n = Taxi.getNum();
		if(temp==0)
			myTaxi[n] = new Taxi();
		else
			myTaxi[n] = new Taxi(temp);

		myTaxi[n].getFuel();
	}
	static void run_taxi() {
		System.out.print("Taxi number? ");
		int n = input.nextInt();
		if(n<=0 || n>Taxi.cnt) {
			System.out.println("No Taxi number");
			return;
		}
		System.out.print("fuel consumption? ");
		int fuel = input.nextInt();
		myTaxi[n].run(fuel);
		myTaxi[n].getFuel();
	}
	static void add_fuel() {
		System.out.print("Taxi number? ");
		int n = input.nextInt();
		if(n<=0 || n>Taxi.cnt) {
			System.out.println("No Taxi number");
			return;
		}
		System.out.print("fuel add? ");
		int fuel = input.nextInt();
		myTaxi[n].refuel(fuel);

		myTaxi[n].getFuel();
		Taxi.getTank();
	}
}
