class studentRecord{
	String name;
    static String school;  // we created school variable static as all students will have the same school name 
}
public class OPPS7_static {  
     public static void main(String args[]) { //main method is always static, so that compiler can call it without the creation of
    	 //an object of the class. Main method is a common starting point of all the stand alone apps in the world
    	 studentRecord.school = "St. Xaviers"; //static variable can be accessed without using objects
    	 studentRecord s = new studentRecord();
    	 System.out.println(s.school);
     }
}
