class test{
	public void method() {
		System.out.println("Method");
	}
	{
		System.out.println("Instance");
		
	}
	
	test(){
		System.out.println("Constructor");
	}
	static{
		System.out.println("Static");
	}
}
public class prob8_static_instance_const {

	public static void main(String[] args) {
		test t = new test();
		t.method();
		test t2 = new test();
		t2.method();
	}

}
