package week6.day3.w6d3assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
public static void main(String[] args) {
	String name = "sathya";
	char[] letter = name.toCharArray();
	Set<Character> unique = new HashSet<Character>();
	for (Character character : letter) {
		boolean add = unique.add(character);
		if(add==false) {
			unique.remove(character);
		}
	}
	System.out.println(unique);
}
}
