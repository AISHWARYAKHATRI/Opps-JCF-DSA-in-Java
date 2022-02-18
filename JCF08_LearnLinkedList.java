import java.util.*;

public class JCF08_LearnLinkedList {
     public static void main(String[] args){
    	 
     	 LinkedList<String> list = new LinkedList<>();
     	 
     	 //add
     	 list.addFirst("a");
     	 list.addLast("b");
     	 list.addLast("c");
     	 list.addLast("d");
     	 
     	 System.out.println(list);
     	 
     	//add method adds node at last by default. To add node at first you need to use addFirst
     	 list.add("e");  
     	 System.out.println(list);
     	
     	 //print size
     	 System.out.println(list.size());
     	 
     	 for(int i=0; i<list.size(); i++) {
     		 System.out.print(list.get(i) + " -> ");
     	 }
     	 System.out.println("null");
     	 
     	 //delete
     	 list.removeLast();
     	 list.removeFirst();
         System.out.println(list);
         
         list.remove(0);
         System.out.println(list);
     }
     
}
     
