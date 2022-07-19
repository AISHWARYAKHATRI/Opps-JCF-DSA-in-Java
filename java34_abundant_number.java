// If the sum of divisors of a number is greater than the number then it is called abundant nuber 
public class java34_abundant_number {
	public static void main(String[] args) {
		int n = 18, sum = 0;
//		TC: O(N) SC: O(1)
		for(int i=1; i<n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum > n) {
			System.out.println("Yes. An abundant number.");
		}
		else {
			System.out.println("No. Not an abundant number.");
		}
//		Intuition: Divisors occur in pairs of i and n/i.For example, if 2 is a divisor of 14 and 14/2 i.e 7 is also a divisor of 14. So now we only need to check from 1 to square root of n.
		sum = 0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		if(sum > n) {
			System.out.println("Yes. An abundant number.");
		}
		else {
			System.out.println("No. Not an abundant number.");
		}
	}
}
