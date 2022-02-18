class Demo{
	int d = 20;
	Demo(){
		d = 40;
	}
}

public class prob5_obj {
     public static void main(String [] args) {
    	 Demo demo = new Demo();
    	 System.out.println(demo.d);
     }
}

//the constructor gets called and the value of d becomes 40