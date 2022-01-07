
public class J90_methods {
	
	public static void printJava() {
		System.out.println("Java Here");
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static void printSum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
     public static void main(String[] args) {
    	 //METHODS
    	 int i = 0;
    	 while(i<5) {
    	 printJava();          //fun call
    	 i++;
    	 }
    	 
    	 printName("Kalik");   //fun call
    	 printSum(10, 20);     //fun call
     }
}
