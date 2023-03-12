package week3assignment;
import java.util.Scanner;
public class OddIndex {
	//make the letters in odd index to uppercase
public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.println("Enter a name/string: ");
	String input = user.nextLine();
	//break into characters
	char[] charac = input.toCharArray();
	//using if condition in for loop gives us the odd index
	for (int i = 0; i < charac.length; i++) {
		if(i%2!=0) {
			char caps = Character.toUpperCase(charac[i]);
			System.out.print(caps);
		}
		else {
			System.out.print(charac[i]);
		}
	}
}
}
