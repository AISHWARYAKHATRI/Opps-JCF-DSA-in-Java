// Write a program to to count number of vowels and consonants in a string.
import java.util.*;
public class java49_vowels_consonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		int vowels = 0, others = 0, digit = 0, blanks = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || 
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				vowels++;
			else if(Character.isDigit(ch))
				digit++;0
			else if(Character.isWhitespace(ch))
				blanks++;
			else
				others++;
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Digits: " + digit);
		System.out.println("Blanks: " + blanks);
		System.out.println("Others: " + others);
	}
}
