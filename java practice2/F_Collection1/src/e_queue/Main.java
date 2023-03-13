package e_queue;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("Suhan");
		que.offer("Hong");
		que.offer("Mathin");
		
		System.out.println(que.poll());
		System.out.println(que.peek());
		System.out.println(que.poll());

	}
}
