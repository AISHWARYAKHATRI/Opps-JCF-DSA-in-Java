
public class java39_product {
	public static void main(String [] args){
		int digit, price = 1, n = 5244; // output 5*2*4*4 = 160
		while(n > 0) {
			digit = n % 10;
			price *= digit;
			n /= 10;
		}
		System.out.println(price);
	}
}
