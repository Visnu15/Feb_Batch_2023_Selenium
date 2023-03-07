package week3.day2.w3d2assignment;

public class ReverseWord {
public static void main(String[] args) {
	String word = "world";
	char[] character = word.toCharArray();
	for (int i = character.length-1; i >= 0; i--) {
		System.out.print(character[i]);
	}
}
}
