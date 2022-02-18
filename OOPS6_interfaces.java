interface Animals{
	int eyes = 2;
	void walk();
}

interface Herbivore{
	
}

class Horse implements Animals, Herbivore{   //multiple inheritance is implemented in Java using interfaces and not classes
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}
public class OOPS6_interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animals h = new Horse();
         h.walk();
	}

}
