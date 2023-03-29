package week6.day3.w6d3assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	Set<String> duplicate = new LinkedHashSet<String>();
	for (String word : split) {
		duplicate.add(word);
	}
	System.out.println(duplicate);
    String string = duplicate.toString().replaceAll("[^A-Z a-z 0-9]", "");
    System.out.println(string);
}
}
