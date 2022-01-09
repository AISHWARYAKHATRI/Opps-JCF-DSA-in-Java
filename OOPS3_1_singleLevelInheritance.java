class Shapes{
	void printArea(double area) {
		System.out.println(area);
	}
}

class Circles extends Shapes{
	double area(double r) {
		double area = (22*r*r)/7;
		return area;
	}
}
public class OOPS3_1_singleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Circles c = new Circles();
            c.printArea(c.area(7));
	}

}
