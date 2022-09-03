import java.util.*;

public class java43_fibonacci_triangle {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fiboTriangle(n);
		sc.close();
	}
	static void fiboTriangle(int n) {
		int N = n*(n+1)/2;
		int f[] = new int[N+1];
		fiboSequence(f, N);
		int fiboNum = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(f[fiboNum++] + " ");
			}
			System.out.println();
		}
	}
	static void fiboSequence(int[] f, int N) {
		f[1] = 1;
		f[2] = 1;
		for(int i=3; i<=N; i++) {
			f[i] = f[i-1] + f[i-2];
		}
	}
}
