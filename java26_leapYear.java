// If the year is (divisible by 400) OR if the (number is divisible by 4 AND not divisible 
// by 100) then , its a leap year

import java.util.*;
public class java26_leapYear {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter no.");
		int year = scc.nextInt();
//		Approach 1 TC: O(1) SC: O(1)
		if(checkForLeapYear(year) == true) {
			System.out.println("A Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
//		Approach 2 TC: O(1) SC: O(1)
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("A Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
	}
	static boolean checkForLeapYear(int year) {
		if(year % 400 == 0) return true;
		if(year % 100 != 0) return false;
		if(year % 4 == 0) return true;
		return false;
	}
}
