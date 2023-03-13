package c_treeSet;
import java.util.*;

class Person implements Comparable<Person> {
	String name;
	private int age;
	public Person(String na, int ag) {
		name = na;
		age = ag;
	}
	public String toString() {
		return name + " " + age;
	}
	public int compareTo(Person p) {
		return this.age - p.age;
	}
}

class PersonComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return (p1.name).compareTo(p2.name);
	}
}

public class Main {
	public static void main(String[] args) {
		Set<Person> tree = new TreeSet<>();
		tree.add(new Person("Suhan", 15));
		tree.add(new Person("jack", 12));
		System.out.println(tree);
		
		Set<Person> tree2 = new TreeSet<>(new PersonComparator());
		tree2.add(new Person("Suhan", 15));
		tree2.add(new Person("jack", 12));
		System.out.println(tree2);
	}
}
