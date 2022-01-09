abstract class Animal{    //abstract class but even though by using abstract we cannot achieve pure abstraction. So we use interfaces. 
	Animal(){
		System.out.println("Created Animal");
	}
	abstract void walk();
	void eat() {
		System.out.println("Eats");
	}
}

class Lion extends Animal{
	Lion(){
		System.out.println("Created lion");
	}
	void walk() {
		System.out.println("Walks on 4 legs");
	}
}

class Chicken extends Animal{
	Chicken(){
		System.out.println("Created chicken");
	}
	void walk() {
		System.out.println("Walks on 2 legs");
	}
}
public class OOPS5_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken c = new Chicken();
		c.walk();

	}

}
