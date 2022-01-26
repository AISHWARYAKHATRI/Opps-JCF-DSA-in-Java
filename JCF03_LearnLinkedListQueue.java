import java.util.*;

public class JCF03_LearnLinkedListQueue {
     public static void main(String [] args) {
    	 Queue<Integer> queue = new LinkedList<>();  //linkedlist implements the queue interface
    	 
    	 queue.offer(34);  //inserts element to the queue
    	 queue.offer(24);
    	 queue.offer(40);  
    	 
    	 System.out.println(queue);
    	 
    	 System.out.println(queue.poll());//returns and removes the head of the queue
    	 
    	 System.out.println(queue.peek()); //returns the head of the queue
     }
}
