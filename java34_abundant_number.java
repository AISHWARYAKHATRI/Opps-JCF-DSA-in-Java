// If the sum of divisors of a number is greater than the number then it is called abundant nuber 
public class java34_abundant_number {
	public static void main(String[] args) {
		int n = 21, sum = 0;
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
//		Approach: TC: O(sqrt(n))) SC: O(1) 
//
//			Traverse from 1 to square root of n.
//			Maintain a variable sum to calculate sum of divisors.
//			If i is a factor of n,add it to the sum as well as add n/i to the sum.But don’t forget to check if i and n/i are same or not.For instance if i=6 and n=36,then i and n/i will have same value and it will not make sense to add both i and n/i,i.e 6 two times.
		sum = 0;
	    for (int i = 1; i * i <= n; i++) {
	      if (n % i == 0) {
	        if (n / i == i) {
	          sum += i;
	        } else {
	          sum += i;
	          sum += n / i;
	        }
	      }
	    }
	    sum -= n;
		if(sum > n) {
			System.out.println("Yes. An abundant number.");
		}
		else {
			System.out.println("No. Not an abundant number.");
		}
	}
}
