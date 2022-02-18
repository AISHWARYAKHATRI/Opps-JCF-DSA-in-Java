class tester{
	private tester(int data) {
		System.out.println("constructor called");
	}
	protected static tester create(int a) {
		 tester obj = new tester(a);
		 return obj;
	}
	public void myMethod() {
		System.out.println("Method called");
	}
}

public class prob4_test {
	public static void main(String[] args) {
     tester obj = tester.create(20);
     obj.myMethod();
}
}

//when a constructor is marked as private, the only way to create a new object of that class from external class is using a method
//that creates a new object, as defined int the above program. The method temp is responsible for creation of tester obj from some external class.
//Once the obj is created, its method can be invoked from the class in which the obj is created