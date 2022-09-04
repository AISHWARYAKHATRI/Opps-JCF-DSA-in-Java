// Program to remove the vowels from the input string.
import java.util.*;
public class java44_remove_vowels {
	public static void main(String[] args) {
	System.out.println("Enter String: ");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String str2 = str.replaceAll("[aeiouAEIOU]", "");
	System.out.println(str2);
	sc.close();
	}
}
