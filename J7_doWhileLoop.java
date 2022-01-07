import java.util.Scanner;

public class J7_doWhileLoop {
    public static void main(String[] args) {
//    	int i = 50;
//    	do {
//    		System.out.println(i);
//    		i--;
//    	}
//    	while(i>=1);
//    }
//    
    int number;
    do {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	number = sc.nextInt();
    	System.out.println("The number is: " + number);
    }
    while(number>0);
    System.out.println("The End");
}
}
