import java.math.*;
public class java21_gcd {
	public static void main(String[] args) {
		int num1 = 8, num2 = 12, ans = 0;
//		TC: O(N) SC: O(1)
		
		for(int i=1; i<=Math.min(num1, num2); i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				ans = i;
			}
		}
		System.out.println("GCD by brute force method: " + ans);
		System.out.println("GCD by Euclideans method: " + gcd(num1, num2));
	}
	
// TC: O(logɸmin(a,b)),where ɸ is 1.61 SC:O(1)
	static int gcd(int i, int j) {
		if(j==0) return i;
		return gcd(j, i%j);
	}
}
