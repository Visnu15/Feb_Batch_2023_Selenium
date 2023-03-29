package week6.day3.w6d3assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	List<Integer> num = new ArrayList<Integer>();
	for (int i = 1; i < 11; i++) {
		num.add(i);
	}
	num.add(4);
	num.add(3);
	num.add(1);
	num.add(8);
	System.out.println(num);
	Set<Integer> numbers = new TreeSet<Integer>(num);
	numbers.remove(Integer.valueOf(5));
	System.out.println(numbers);
	List<Integer> n = new ArrayList<Integer>(numbers);
	for (int i = 0; i < n.size(); i++) {
		if(n.get(i)!=i+1) {
			int missing = i+1;
			System.out.println("Missing number: "+ missing);
			break;
		}
	}
}
}