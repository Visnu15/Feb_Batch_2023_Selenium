package week3assignment;

public class SwappingValues {
public static void main(String[] args) {
	//using temporary variable
	int a = 698;
	int b = 542;
	//assign the value of a to a 3rd temp variable
	int c = a; 
	//assign value of a to b and b to c
	a=b;
	b=c;
	//now print a and b
	System.out.println("Swapped value of a: " + a);
	System.out.println("Swapped value of b: " + b);
	
	

	//with temp variable
	int i = 2;
	int j = 5;
	
	i = i+j; //i becomes 7
	j = i-j; //7-5=2
	i = i-j; //7-2=5
	
	System.out.println("Swapped value of i: " + i);
	System.out.println("Swapped value of j: " + j);
}
}
