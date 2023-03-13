package i_arraySort;
import java.util.Arrays;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String na, int ag) {
		name = na;
		age = ag;
	}
	public int compareTo(Person obj) {
//		return this.age - p.age;
//		return p.age - this.age;  // 나이 역순
//		return this.name.length() - p.name.length();
		return (this.name).compareTo(obj.name);
	}
	public String toString() {
		return name + ": " + age;
	}
}

public class Main {
	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("Suhan", 19);
		arr[1] = new Person("Jack", 23);
		arr[2] = new Person("Miachel", 5);
		Arrays.sort(arr, (p1, p2) -> p1.age - p2.age);
		showAll(arr);
		int idx = Arrays.binarySearch(arr, new Person("Jack", 5));
		System.out.println(idx);
	}
	public static void showAll(Person[] arr) {
		for(Person d : arr) {
			System.out.println(d.toString());
		}
	}
}
