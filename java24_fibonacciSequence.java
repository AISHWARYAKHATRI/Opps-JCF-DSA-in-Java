
public class java24_fibonacciSequence {

	public static void main(String[] args) {
		int n = 5;
//		TC: O(n)+O(n), for calculating and printing the Fibonacci series
//		SC: O(n) for storing fibonacci sequence
		if(n == 0) {
			System.out.print("Fibbonacci Sequence(naive approach):");
		}else {
			int [] fib = new int[n+1];
			fib[0] = 0;
			fib[1] = 1;
			for(int i=2; i<=n; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			System.out.println("Fibbonacci Sequence(naive approach): ");
			for(int i=0; i<=n; i++) {
				System.out.print(" " + fib[i]);
			}
		}
		
		
//      TC: O(N) SC: O(1)
		if(n == 0) {
			System.out.println("\nFibbonacci Sequence(space approach): " + n);
		}else {
			int secondLast = 0;
			int last = 1;
			System.out.print("\nFibbonacci Sequence(space approach):\n" + secondLast + " " + last);
			int curr;
			for(int i=2; i<=n; i++) {
				curr = secondLast + last;
				secondLast = last;
				last = curr;
				System.out.print(" " + curr);
			}
		}
	}
}
