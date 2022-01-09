class Students{
	String name;
	int rollNo;
	
	//method overloading
	
	public void printIno(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int rollNo) {
		System.out.println(rollNo);
	}
	
	public void printInfo(String name, int rollNo) {
		System.out.println(name);
		System.out.println(rollNo);
		
	}
}
public class OOPS2_polymorphism {
    public static void main(String[] args) {
    	
    	Students s1 = new Students();
//        s1.name = "Aish";
//        s1.rollNo = 21;
        s1.printInfo("aish", 21);
    }
}
