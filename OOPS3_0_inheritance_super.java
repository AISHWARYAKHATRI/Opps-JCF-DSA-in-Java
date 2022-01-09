import java.util.*;

class Shape{  //base class or parent class or super class
	Shape(){
		System.out.println("Called by super");
	}
	String color;
	int x = 10;
	void display() {
		System.out.println(x);
	}
}

class Circle extends Shape{  //sub-class or child class
	Circle(){
	super();    //super() is used to invoke the immediate parent class constructor
	}
      int radius;	
      int x = 20;
      void display() {
      System.out.println(super.x); //super is used to access the class variable of immediate parent class
      super.display();             //super is used to invoke the class method of immediate parent class
      }
     
}

public class OOPS3_0_inheritance_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c = new Circle();
		 c.color = "black";
		 c.display();

	}

}
