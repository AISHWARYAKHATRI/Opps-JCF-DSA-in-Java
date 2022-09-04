// Write a program to transform strings of lowercase alphabet characters by replacing each letter
// with the subsequent character in the english alphabet.
import java.util.*;
public class java48_subsequent_character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String str2 = "";
		for(int i=0; i<str.length(); i++) {
			str2 += (char)(int)(str.charAt(i)+1);
		}
		System.out.println(str2);
	}
}
