import java.util.*;

public class java46_lastString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Last string is: " + str.substring(str.lastIndexOf(' '), str.length()));
		String[] str2 = str.split(" ");
		System.out.println(Arrays.toString(str2));
		sc.close();
	}
}
