
public class J1_dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("aish");
     
     //PRIMITIVE
     
     //byte - 1 [-128 to 127]
     //short - 2
     //int - 4
     //long - 8
     //float - 4
     //double - 8 
     //char - 2  a, b, c
     // boolean - 1 byte true/false
     
     long phone = 1234567800L; //In Java, by default all integers are taken as int, not Long i.e. why we use L or l.
     //And all numbers with decimal point are taken as double, not float i.e. why we use F or f.
     float pi = 3.14F;
     char letter ='@';
     boolean isAdult = true;
     
     //NON-PRIMITIVE TYPE
     //String 
     
     String name = "Aman"; //OR
     String name1 = new String("Anam");
     System.out.println(name.length());
     System.out.println(name1.length());
     
     //concatanation
     String name2 = name +" "+ name1;
     System.out.println(name2);
     
     System.out.println(name2.charAt(0));
     System.out.println(name2.length());
     
     //replace
     String name3 = name1.replace('m', 'n');
     System.out.println(name3);

     //substring
     
     System.out.println(name.substring(0, 3));
	}

}
