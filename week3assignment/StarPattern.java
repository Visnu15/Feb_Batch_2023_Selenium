package week3assignment;

public class StarPattern {
public static void main(String[] args) {
	//initialize two for loops(nested for loop) one for rows and another one for column
	for (int i = 1; i <= 8; i++) {
		//if i is 3, j will be 1 2 3 hence star will be printed for 1,2,3 times as per second for loop
		for (int j = 1; j <= i; j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
