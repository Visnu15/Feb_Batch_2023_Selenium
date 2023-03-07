package week3.day2.w3d2assignment;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.println("Enter any name: ");
	String input = user.nextLine();
	
	char[] character = input.toCharArray();
	String reverse = "";
	for (int i = 0; i < character.length; i++) {
		reverse = character[i] + reverse;
	}
	System.out.println("Given string: " + input);
	System.out.println("Reversed string: " + reverse);
	
	if(input.equals(reverse)) {
		System.out.println(input + " is a palindrome.");
	}
	else{
		System.out.println(input + " is not a palindrome.");
	}



}
}
