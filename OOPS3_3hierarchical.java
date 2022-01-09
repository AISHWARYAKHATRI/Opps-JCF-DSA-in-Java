class Person{
	String name;
	protected int age;
	
	void printInfo() {
		System.out.println(this.name+" "+this.age);
	}
}

class Manager extends Person{
	
}

class Employee extends Person{
	
}

public class OOPS3_3hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Manager m = new Manager();
         m.name = "Aman";
         m.age = 12;
         m.printInfo();
	}

}
