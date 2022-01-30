class Palindrome{
	public Boolean palin(int num) {
		int rev = 0;
		int num1 = num;
		while(num1 > 0) {
			rev = rev*10 + num1%10;
			num1 = num1/10;
		}
		if(num == rev) return true;
		else return false;
	}
}


public class prob1_palindrome {
      public static void main(String[] args) {
    	  Palindrome num = new Palindrome();
    	  System.out.println(num.palin(123));
      }
}
