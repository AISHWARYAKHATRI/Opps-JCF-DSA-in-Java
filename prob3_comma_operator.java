
public class prob3_comma_operator {
public static void main(String[] args) {
	int sum = 0;
	for(int i=0, j=0; i<5 & j<5; ++i, j = i+1)
		sum+=i;
		System.out.println(sum);
}
}


//output = 6
//Using comma operator, we can include more than one statement 
//int the initialization and iteration portion of the for loop. 
//Therefore both ++i and j = i+1 is executed i gets the value of 0,1,2,3,4 and j gets 
//the values of 0,1,2,3,4,5

