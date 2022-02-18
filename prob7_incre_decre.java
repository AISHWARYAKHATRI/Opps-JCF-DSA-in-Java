
public class prob7_incre_decre {

	public static void main(String[] args) {
         int x = 0;
         int y = 0;
         for(int z=0; z<5; z++) {
        	 if((++x > 2) || (++y > 2)) { //or checks for one of the conditions.
        		 x++;
        	 }
         }
         System.out.println(x+" "+y);
	}

}
