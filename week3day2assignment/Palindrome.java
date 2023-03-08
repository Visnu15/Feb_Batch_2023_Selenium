package week3.day2.week3day2assignment;

public class Palindrome {
public static void main(String[] args) {
	String text = "madam";
	char[] charac = text.toCharArray();
	String rev = "";
	for (int i = 0; i < charac.length; i++) {
		rev = charac[i] + rev;
	}
	if(text.equals(rev)) {
		System.out.println(text + " is a palindrome");
	}
	else {
		System.out.println(text + " is not a palindrome");
	}
}
}
