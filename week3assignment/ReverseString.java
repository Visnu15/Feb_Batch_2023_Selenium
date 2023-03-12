package week3assignment;

public class ReverseString {
public static void main(String[] args) {
	//method 1
	String txt = "word";
	//break into characters
	char[] array = txt.toCharArray();
	//reverse for loop
	for (int i = array.length-1; i >= 0; i--) {
		System.out.print(array[i]);
	}
	
	
	System.out.println();
	
	//method 2
	//string buffer
	StringBuffer str = new StringBuffer();
	str.append("himalayas");
	System.out.println(str.reverse());
	
}
}
