import java.util.*;

public class JCF06_LearnSet {
    public static void main(String[] args) {
    	
//    	Set<Integer> set = new HashSet<>();  //O(1)
//    	Set<Integer> set = new LinkedHashSet<>();
    	Set<Integer> set = new TreeSet<>();  //O(log n)
    	
    	set.add(32);  // adds the specified element to the set
    	set.add(43);
    	set.add(24);
    	set.add(67);
    	set.add(43);
    	
    	System.out.println(set);
    	
    	set.remove(43);   //removes the specified element from the set
    	System.out.println(set);
    	
    	System.out.println(set.contains(43)); //returns true if the set contains the specified element
    	
    	System.out.println(set.isEmpty());
    	
    	System.out.println(set.size()); // returns the length (number of elements) of the set
    	
    	set.clear(); // returns the length (number of elements) of the set
    }
}
