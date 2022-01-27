import java.util.*;

public class JCF05_LeanArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(24);
		adq.offerFirst(42);
		adq.offerLast(12);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println("poll(): " + adq.poll());
		System.out.println("pollFirst(): " + adq.pollFirst());
		System.out.println("pollLast(): " + adq.pollLast());
	}
}
