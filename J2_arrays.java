import java.util.Arrays;

public class J2_arrays {
     public static void main(String[] args) {
    	 
    	 int[] marks = new int[3]; //OR
    	 int[] marks1 = {11, 21, 45};
    	 marks[0] = 97;
    	 marks[1] = 100;
    	 marks[2] = 90;
    	 System.out.println(marks[0]); // if marks was declared and not initialized, 
    	 //then while printing it will print 0 for int type array and false for boolean by default. 
    	 //In languages like C C++, it would take any garbage value
    	 
    	 //property length of array
    	 System.out.println(marks.length);
    	 
    	 //sort
    	 //before sort
    	 System.out.println(marks[0]);
    	 Arrays.sort(marks);
    	 //afte sort
    	 System.out.println(marks[0]);
    	 
    	 boolean[] a = new boolean[3]; 
    	 System.out.println(a[1]);
    	 
    	 //two D array
    	
    	 int[][] finalMarks = {{1, 2, 3},{3, 4, 5}};
    	 System.out.println(finalMarks[1][2]);
     }
}
