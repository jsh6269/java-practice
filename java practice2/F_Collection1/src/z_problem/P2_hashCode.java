package z_problem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person2 {
    private String name;
    private int age;
    
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + "(" + age + "¼¼)";
    }
    
    public int hashCode() {
    	return Objects.hash(name, age);
    }
    
    public boolean equals(Object obj) {
    	return name.equals(((Person2)obj).name) && age == ((Person2)obj).age;
    }
    
}
public class P2_hashCode {
	public static void main(String[] args) {
		Set<Person2> mySet = new HashSet<>();
		mySet.add(new Person2("Suhan", 19));
		mySet.add(new Person2("Back", 12));
		mySet.add(new Person2("Back", 12));
		System.out.println(mySet);
	}
}
