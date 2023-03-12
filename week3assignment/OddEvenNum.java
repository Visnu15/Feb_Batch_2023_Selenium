package week3assignment;
import java.util.Scanner;
public class OddEvenNum {
public static void main(String[] args) {
	//checking whether the number is odd or even
	//initiating scanner class
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a num: ");
	//scanning the user input and assigning it to a variable
	int user = scan.nextInt();
	//checking if the entered number is divisible by 2
	if(user%2==0) {
		System.out.println(user + " is even");
	}
	else {
		System.out.println(user + " is odd");
	}
	
	//printing even numbers (1-20)
	System.out.println("Even numbers from 1 to 20: ");
	//initializing for loop to iterate over each numbers from 1 to 20
	for (int i = 1; i <= 20; i++) {
		//checking if the number is divisible by 2
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	//printing odd numbers from 1 to 20
	System.out.println("Odd numbers from 1 to 20: ");
	for(int i=1;i<=20;i++) {
		//checking if the number is divisible by 2
		if(i%2!=0) {
			System.out.println(i);
		}
	}
}
}
