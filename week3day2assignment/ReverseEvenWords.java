package week3.day2.week3day2assignment;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester"; 
	String[] split = test.split(" ");
	for (int i = 0; i < split.length; i++) {
		if(i%2!=0) {
			char[] charac = split[i].toCharArray();
			for (int j = charac.length-1; j >= 0; j--) {
				System.out.print(charac[j]);
			}
		}
		else {
			System.out.print(" ");
			System.out.print(split[i] + " ");
		}
	}
}
}
