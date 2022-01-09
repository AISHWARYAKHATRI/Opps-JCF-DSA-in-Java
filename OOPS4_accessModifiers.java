import Bank.*;

class Account{
	public String name;
	int age;
	protected String email;
	private String password;
	//getters and setters
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
}

public class OOPS4_accessModifiers {
      public static void main(String args[]) {
      
    	  Account a = new Account();
    	  a.name = "Aishwarya";   // name is public 
    	  a.age = 13;
    	  a.email = "aish@gmail.com";
    	  a.setPassword("aish");
    	  System.out.println(a.getPassword());
      }
      
}
