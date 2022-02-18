
public class prob6_passed_by_value {
	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;
	}

	public static void main(String[] args) {
        Integer i = new Integer(20);
        Integer j = new Integer(10);
        swap(i, j);
        System.out.println(i + " " + j);
	}

}

//in java, in functions all the values are passed by value and not as reference