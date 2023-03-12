package week3assignment;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	System.out.println("Enter a number, of which you want to get the factorial: ");
	Scanner scan = new Scanner(System.in);
	int user = scan.nextInt();
	//create a temp variable to store the value
	int fact = 1;
	//initialize a reverse for loop
	//to get factorial of 5, multiply 5,4,3,2,1
	for (int i = user; i > 0; i--) {
		//multiply each element with fact
		fact = fact*i;
	}
	System.out.println("Factorial of " + user + " is " + fact);
}
}
