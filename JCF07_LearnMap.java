import java.util.*;

public class JCF07_LearnMap {
      public static void main(String [] args) {
    	  
    	  //elements of Map are stored in key/value pairs. 
    	  //Keys are unique values associated with individual Values.
    	  Map<String, Integer> map = new HashMap<>();
    	  
    	  //to add elements to the hashMap
    	  map.put("I", 1); 
    	  map.put("V", 5);
    	  map.put("X", 10);
    	  map.put("L", 51);
    	  map.put("C", 100);
    	  map.put("D", 500);
    	  map.put("M", 1000);
    	  
    	  System.out.println(map);
    	  
//    	  if(!map.containsKey("0")) {
//    		  map.put("O", 23);
//    	  }
    	  
    	  map.putIfAbsent("Four", 4);
    	  
    	  //to remove element of the hashMap
    	  map.remove("Four");

    	  //to change the value associated with the key use replace()
    	  map.replace("L", 50);
    	  
    	  //to access elements of the hashMap
    	  System.out.println(map.get("V")); //takes key as argument and returns the corresponding value associated with the key
    	  
    	  //Iterate the map
    	  for(Map.Entry<String, Integer> e: map.entrySet()) {
    		  System.out.println(e);
    		  System.out.println(e.getKey());
    		  System.out.println(e.getValue());
    	  }
    	  
    	  //to iterate only keys
    	  for(String key: map.keySet()) {
    		  System.out.println(key);
    	  }
    	  
    	  //to iterate only values
    	  for(Integer key: map.values()) {
    		  System.out.println(key);
    	  }
    	  
          //to check if a particular key is present
    	  System.out.println(map.containsKey("V"));
    	  
    	  //to check if a particular value is present
    	  System.out.println(map.containsValue(100));
    	  
    	  //to check if map is empty
    	  System.out.println(map.isEmpty());
    	  
    	  //to clear the map
    	  map.clear();
      }
}

