// When the sum of factorial of individual digits of a number is equal is to the original number
// the number is called strong number. Strong number is also known as krishnamurthi no./Peterson number
public class java33_strong_number {

	public static void main(String[] args) {
		int n = 145, digit, temp = n, sum = 0;
		while(n != 0) {
			digit = n % 10;
			sum += fact(digit);
			n /= 10;
		}
		if(sum == temp) System.out.println("Yes. Strong Number");
		else System.out.println("No. Not a Strong Number");
	}
	static int fact(int n) {
		if(n == 0) return 1;
		return n * fact(n-1);
	}
}

// TC: O(N*M) where N is the number of digits and M is the time taken to compute the factorial of the digit.
