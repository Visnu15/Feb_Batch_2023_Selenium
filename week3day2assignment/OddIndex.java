package week3.day2.week3day2assignment;

public class OddIndex {
public static void main(String[] args) {
	String test = "changeme";
	char[] charac  = test.toCharArray();
	for (int i = 0; i < charac.length; i++) {
		if(i%2!=0) {
			char upper = Character.toUpperCase(charac[i]);
			System.out.print(upper);
		}
		else {
			System.out.print(charac[i]);
		}
	}
}
}
