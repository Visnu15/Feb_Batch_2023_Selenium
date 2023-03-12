package week3assignment;

public class ReverseEvenWords {
public static void main(String[] args) {
	String txt = "This is the program for reversing even words";
	//splitting sentance into words
	String[] split = txt.split(" ");
	//use for loop to find the even and odd index
	for (int i = 0; i < split.length; i++) {
		if(i%2!=0) {
			//if the index is odd, the word will be even
			char[] charac = split[i].toCharArray();
			String rev = "";
			//reverse the particular word
			for (int j = charac.length-1; j >= 0; j--) {
				rev = rev + charac[j];
			}
			System.out.print(rev + " ");
		}
		else {
			System.out.print(split[i]);
			System.out.print(" ");
		}
	}
}
}
