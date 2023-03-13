package f_deque;
import java.util.*;

interface DIStack<E> {
	public boolean push(E item);
	public E pop();
	public E top();
}

class DCStack<E> implements DIStack<E> {
	private Deque<E> deq;
	public DCStack(Deque<E> d) {
		deq = d;
	}
	public boolean push(E item) {
		return deq.offerFirst(item);
	}
	public E pop() {
		return deq.pollFirst();
	}
	public E top() {
		return deq.peekFirst();
	}
}

public class Main {
	public static void main(String[] args) {
//		Deque<String> deq = new LinkedList<>();
//		deq.offerFirst("First");
//		deq.offerLast("Fuck");
//		System.out.println(deq.pollFirst());
		DIStack<String> stack = new DCStack<String>(new ArrayDeque<String>());
		stack.push("theit");
		stack.push("asdf");
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
