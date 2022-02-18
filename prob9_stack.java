import java.util.*;

class my_stack{
	public void function(Stack<Integer> stack, int top){
		if(top!=-1) {
			function(stack, top-1);
			System.out.println(top);
		}
	}

}

public class prob9_stack {
	
	
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<>(); 
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(50);
		my_stack st = new my_stack();
		st.function(list, 3);
	}

}
