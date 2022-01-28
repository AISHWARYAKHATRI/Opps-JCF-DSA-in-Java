import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		//STRINGS ARE IMMUTABLE
		
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Your name is: " + name);
           //concatenation
           String firstName = "Tony";
           String lastName = "Stark";
           String fullName = firstName + " " + lastName;
           System.out.println(fullName);
           System.out.println(firstName.length());
           
           //charAt
           for(int i=0; i<fullName.length(); i++) {
        	   System.out.println(fullName.charAt(i));
           }
           
           //compare 
           //1 s1 > s2: +ve value
           //2 s1 < s2: -ve value
           //3 s1 == s2: 0
           String name1 = "Aishw";
           String name2 = "Aish";
           if(name1.compareTo(name2) == 0) System.out.println("yes");
           else System.out.println("No");
           
           if(new String("aish") == new String("aish")) {
        	  System.out.println("yes");
           }
           else System.out.println("No");
          
           //substr
           System.out.println(fullName.substring(0, 5));
           System.out.println(name1.toLowerCase());
	}

}
