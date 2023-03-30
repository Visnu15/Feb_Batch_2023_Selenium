package week6.day3.w6d3assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "PayPal India";
	//expected output = ylnd
	String txt = text.replaceAll("\\s", "");
	String lowerCase = txt.toLowerCase();
	char[] charArray = lowerCase.toCharArray();
    Set<Character> charSet = new LinkedHashSet<Character>();
    Set<Character> dupCharSet = new LinkedHashSet<Character>();
for (Character charac : charArray) {
	boolean add = charSet.add(charac);
	if(add==false) {
		dupCharSet.add(charac);
	}
}
System.out.println(charSet);
System.out.println(dupCharSet);
List<Character> list = new ArrayList<Character>(charSet);
List<Character> list1 = new ArrayList<Character>(dupCharSet);
for (int i = 0; i < list.size(); i++) {
	for (int j = 0; j < list1.size(); j++) {
		if(list.get(i)==list1.get(j)) {
			list.remove(list.get(i));
		}
	}
}
System.out.println(list);

}
}
