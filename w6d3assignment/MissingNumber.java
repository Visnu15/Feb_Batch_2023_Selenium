package week6.day3.w6d3assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	int[] arr = {9,2,1,5,9,2,3,6,8,7,8,10};
	Set<Integer> num = new TreeSet<Integer>();
	for (Integer nums : arr) {
		num.add(nums);
	}
	System.out.println(num);
	List<Integer> number = new ArrayList<Integer>(num);
	for (int i = 0; i < number.size(); i++) {
		if(number.get(i)!=i+1) {
			int missing = i+1;
			System.out.println("Missing number: " + missing);
			break;
		}
	}
}
}