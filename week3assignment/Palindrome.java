package week3assignment;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.println("Enter a name: ");
	//scan the user input
	String input = user.nextLine();
	//break the string into characters
	char[] charac = input.toCharArray();
	//create a temp variable to store the reversed values
	String rev = "";
	//initiate reverse for loop to iterate over each characters
	for (int i = charac.length-1; i >= 0; i--) {
		rev = rev + charac[i];
	}
	System.out.println("Reveresed string: " + rev);
	//check if rev and input are same
	if(input.equals(rev)) {
		System.out.println(input + " is palindrome");
	}
	else {
		System.out.println(input + " is not palindrome");
	}
	
}
}
