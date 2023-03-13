package z_problem;
import java.util.*;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + "(" + age + "¼¼)";
    }
    
    public int hashCode() {
    	return name.hashCode() + age % 7;
    }
    
    public boolean equals(Object obj) {
    	return name.equals(((Person)obj).name) && age == ((Person)obj).age;
    }
    
}
public class P1_hashCode {
	public static void main(String[] args) {
		Set<Person> mySet = new HashSet<>();
		mySet.add(new Person("Suhan", 19));
		mySet.add(new Person("Back", 12));
		mySet.add(new Person("Back", 12));
		System.out.println(mySet);
	}
}
