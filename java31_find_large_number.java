
public class java31_find_large_number {

	public static void main(String[] args) {
		int n = 9578, rem;
		int max = -1, min = -1;
		while(n != 0) {
			rem = n % 10;
			if(rem > max) max = rem;
			else min = rem;
			n /= 10;
		}
		System.out.println("Max: " + max + " Min: " + min); 
	}
}
