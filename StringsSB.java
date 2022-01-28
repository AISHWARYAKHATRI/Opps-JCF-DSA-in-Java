import java.util.*;

public class StringsSB {
        public static void main(String [] args) {
        	StringBuilder sb = new StringBuilder("Tia");
        	//charAt
        	System.out.println(sb.charAt(0));
        	//set char at index
        	sb.setCharAt(2,'s');
        	System.out.println(sb);
        	//insert char
        	sb.insert(2, 'a');
        	System.out.println(sb);
        	//delete
        	sb.delete(2, 3);
        	System.out.println(sb);
        	//append
        	sb.append('s'); //does not make new string. Rather changes are made to the same string
        	System.out.println(sb);
        	//length
        	System.out.println(sb.length());
        }
}

