import java.util.Scanner;

public class J91_guessTheNumber {
	
     public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
    	int userNum = 0;
    	int gNum = (int)(Math.random() * 100 + 1);
    	
    	do {
    		System.out.println("Guess the number: ");
    		userNum = sc.nextInt();
    		
    		if(userNum == gNum) {
    			System.out.println("You have guessed it right!");
    			break;
    		}
    		
    		else if(userNum > gNum) {
    			System.out.println("Num too big");
    		}
    		
    		else {
    			System.out.println("Num too small");
    		}
       	
     } while(userNum>0);
    	
    	System.out.println("The number was " + gNum);
    	sc.close();
   }
}
