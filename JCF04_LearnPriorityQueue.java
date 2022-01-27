import java.util.*;

public class JCF04_LearnPriorityQueue {
    public static void main(String [] args) {
    	
    	Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); //comparator converts into max-heap
    	
    	queue.offer(78);
    	queue.offer(56);
    	queue.offer(24);  //inserts the specified element in the queue
    	
    	System.out.println(queue); //prints min-heap
    	
    	queue.poll();   //returns and removes the head of the queue
    	System.out.println(queue);
    	
    	System.out.println(queue.peek()); //returns the head of the queue
    }
}
