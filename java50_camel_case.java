// Write a program to Convert a String to Camel Case.
import java.util.Scanner;

public class java50_camel_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		String res = "";
		String remaining = "";
		for(String s : str1) {
			res = s.substring(0, 1).toUpperCase();
			System.out.print(res);
			remaining = s.substring(1, s.length()).toLowerCase();
			System.out.print(remaining);
		}
	}

}
