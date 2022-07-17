import java.util.*;
public class java30_roots_of_quadratic_eq {
	public static void main(String[] args) {
		int a = 1, b = -3, c = -10;
		roots(a, b, c);
	}
	static void roots(int a, int b, int c) {
		int d = b*b - 4*a*c;
		double sqrt_val = Math.sqrt(Math.abs(a));
		if(d > 0) {
			System.out.println("Roots are real and different.");
			double root1 = (double) (-b + sqrt_val) / (2*a);
			double root2 = (double) (-b - sqrt_val) / (2*a);
			System.out.println(root1 + "\n" + root2);
		}else if(d == 0) {
			System.out.println("Roots are real and same.");
			double root1 = -(double)b / 2*a;
			double root2 = -(double)b / 2*a;
			System.out.println(root1 + "\n" + root2);
		}else {
			System.out.println("Roots are complex");
			System.out.println(-(double)b / 2*a + " + i" + sqrt_val + "\n" + 
			                   -(double)b / 2*a + " - i" + sqrt_val);
		}
	}
}
