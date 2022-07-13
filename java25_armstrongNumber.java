// Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal 
// to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.

import java.util.*;
public class java25_armstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(check(n)) System.out.println("An Armstrong Number");
		else System.out.println("Not an Armstrong Number");
		}
	static boolean check(int n) {
		int temp = n, count = 0, originalNumber = n;
		while(temp > 0) {
			count++;
			temp /= 10;
			}
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum += Math.pow(digit, count);
			n /= 10;
			}
		return (sum == originalNumber);
		}
}

// TC: O(N), where N is the number of digits since we need to traverse every digit and add digits raised to power no. of digits to sum.
// SC: O(1), no extra space required
