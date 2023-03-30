package week6.day3.w6d3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	List<String> text = new ArrayList<String>();
	text.add("HCL");
	text.add("Wipro");
	text.add("Aspire Systems");
	text.add("CTS");
	System.out.println(text.size());
	Collections.sort(text);
	System.out.println(text);
	Collections.reverse(text);
	System.out.println(text);
}
}
