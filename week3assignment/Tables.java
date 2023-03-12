package week3assignment;
import java.util.Scanner;
public class Tables {
	//this program will print tables of any numbers upto 10 times 
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//get the input form user
	System.out.println("Table: ");
	int user = scan.nextInt();
	//initialize for loop to get multiplied upto 10 times 
	for (int i = 1; i < 11; i++) {
		//print the output in tables format
		System.out.println(user + "*" + i + "=" + user*i);
	}
}
}
