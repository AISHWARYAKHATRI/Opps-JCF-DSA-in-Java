
public class J8_break_contiinue {
    public static void main(String[] args) {
    	int i = 0;
    	while(true) {
    		if(i == 3) {
    			i++;
    			continue;   // continue skips all lines below it and control goes directly to while.
    		}
    		System.out.println(i);
    		i++;
    		if(i>5) {
    			break;
    		}
    	}
    }
}
