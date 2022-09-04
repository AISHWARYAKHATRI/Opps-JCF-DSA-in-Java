// Find the frequency of a desired character in a string.
import java.util.*;
public class java47_desired_char_freq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter character: ");
		char c = sc.next().charAt(0);
		System.out.println(find_freq(str, c));
	}
	static int find_freq(String str, char c) {
		int freq = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) freq++;
		}
		return freq;
	}
}
