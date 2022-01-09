class Area{
	void printArea(int area) {
		System.out.println(area);
	}
}

class Triangle extends Area{
	int area(int l, int h) {
		int area = (l*h)/2;
		return area;
	}
}

class EquilateralTriangle extends Triangle{
	
}

public class OOPS3_2_multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EquilateralTriangle s = new EquilateralTriangle();
         s.printArea(s.area(5,  4));
         
	}

}
