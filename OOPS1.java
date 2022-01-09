import Bank.*;

class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Writing");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student{
	
	//non-parameterized const
	Student(){
		System.out.println("Called");
	}
	
	//parameterized const
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String name="aish";
	int age;
	
	//copy const
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	public void printDetail() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}


public class OOPS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Pen pen1 = new Pen();
          pen1.color = "Blue";
          pen1.type = "Ball";
          pen1.write();
          
          Pen pen2 = new Pen();
          pen1.printColor();
          pen2.printColor();
          
          Student s1 = new Student("Aman", 21);
          Student s2 = new Student();
          Student s3 = new Student(s1);
          
          s1.printDetail();
          s2.printDetail();
          s3.printDetail();
          
       Bank bank = new Bank();
       bank.name = "aishwarya";
       System.out.println(bank.name);
          
	}

}
