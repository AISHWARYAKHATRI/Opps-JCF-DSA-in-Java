import java.util.*;  //Java collection framework is defined in java.util package

public class JCF01_LearnArrayList {
    public static void main(String [] args) {
    	
    	//
    	
    	List<String> names = new ArrayList<>(); //list interface can implemented with LinkedList<>().
    	names.add("Tia");
    	names.add("Alisha");
    	names.add("Zian");
    	names.add("Natasha");
    	names.add("Prish");
    	
    	names.set(3, "Axay");
    	
    	names.remove(4);
    	names.remove(String.valueOf("Axay"));
    	
    	for(String i: names) {
    		System.out.println("For each loop:" + i);
    	}
    	
    	System.out.println(names);
    	System.out.println("At this: " + names.get(1));
    	System.out.println("Contains: " + names.contains("Alisha"));
    	
    	names.clear();
    	
    	//
    	
    	String[] students = new String[30];
    	students[0] = "Aishwarya";
    	students[1] = "Khatri";
    	
    	ArrayList<String> studentsName = new ArrayList<>(); //empty array is created
    	
    	//size = n + n/2 + 1 new array is created and copies old in the new one created;
    	studentsName.add("Aishwarya");
    	studentsName.add("Khatri");
    	System.out.println(studentsName);
         
    	List<Integer> list = new ArrayList<>();
    	List<Integer> newList = new ArrayList<>();
    	list.add(1);   //to add element to the list
    	list.add(2);
    	list.add(1, 30);   //this will add 30 at index 1
    	list.addAll(newList);
    	
    	list.set(1, 100); // to update an element
    	
    	for(int i=0; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	}
    	
    	for(String element: studentsName) {   //for each loop
    		System.out.println("For each loop:" + element);
    	}
    	
    	Iterator<Integer> it = list.iterator();  // to iterate the collection
    	while(it.hasNext()) {
    		System.out.println("Iterator:" + it.next());
    	}
    	
    	System.out.println(list.contains(100)); //to check if a particular element is present or no
    	
    	System.out.println(list); //this will add all elements of list in newList
    	
    	System.out.println(list.get(0)); //to get a particular element
    	System.out.println(list.remove(1)); //this removes the element at the given position
    	list.remove(Integer.valueOf(1));   //this will remove the the type of element provided 
    	System.out.println(list);
    	list.clear();
    	System.out.println(list);
    	
    	int function(int a, int b) {
    		if(b<=0) return 0;
    		else return a+function(a, b-1);
    	}
    }
}
