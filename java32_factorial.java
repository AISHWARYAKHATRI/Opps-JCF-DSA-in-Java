
public class java32_factorial {

	public static void main(String[] args) {
		int n = 5;  // n is always a positive number
		System.out.println("Recursive: " + fact(n)); // TC: O(N) SC: O(1)
		System.out.println("Iterative: " + factI(n)); // TC: O(N) SC: O(1)
	}
	static int fact(int n) {
		if(n == 0) return 1;
		return n * fact(n-1);
	}
	static int factI(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
}
