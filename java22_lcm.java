
public class java22_lcm {
	public static void main(String[] args) {
		int num1 = 90, num2 = 60, gcd = 0, lcm;
//		TC: O(N) SC: O(1)
		for(int i=1; i<=Math.min(num1, num2); i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		lcm = (num1*num2)/gcd;
		System.out.println("Lcm by brute force method is: "+lcm);
		lcm = (num1*num2)/gcd(num1, num2);
		System.out.println("Lcm by brute force method is: "+lcm);
	}
//      TC: O(logɸmin(a,b)),where ɸ is 1.61. SC: O(1)
	static int gcd(int i, int j) {
		if(j == 0) return i;
		return gcd(j, i%j);
	}
}
