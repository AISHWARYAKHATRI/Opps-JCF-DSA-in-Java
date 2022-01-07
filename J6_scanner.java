import java.util.Scanner;


public class J6_scanner {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Age: ");
	  float age = sc.nextFloat();
	  System.out.println(age);
	  System.out.println("Enter your name: ");
	  String name = sc.next();
	  System.out.println(name);
	  System.out.println("Name1:");
	  String name1 = sc.nextLine();
	  System.out.println(name1);
  }
}
