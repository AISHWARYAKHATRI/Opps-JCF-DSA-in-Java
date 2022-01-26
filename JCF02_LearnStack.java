import java.util.*;

public class JCF02_LearnStack {
	public static void main(String[] args) {
		
     Stack<String> languages = new Stack<>();
     
     languages.push("Java");    //to add element to the stack
     languages.push("C");
     languages.push("Javascript");
     languages.push("Php");
     
     System.out.println(languages); 
      
     System.out.println(languages.peek()); //returns the top element
     
     System.out.println(languages.pop()); //removes the element at 
     
     System.out.println(languages);
     }
}