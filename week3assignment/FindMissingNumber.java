package week3assignment;

import java.util.Arrays;

public class FindMissingNumber {
public static void main(String[] args) {
	//method1
	int[] arr = {8,5,2,1,7,3,6}; //output must be 4
	//sort the array to ascending order to find starting and ending value
	Arrays.sort(arr);
	//create a temp variable to store the value
	int sum1 = 0;
	//initialize for loop the get the sum of numbers
	for (int i = 1; i <= 8; i++) {
		sum1 = sum1 + i;
	}
	//now find the sum of index
	int sum2 = 0;
	for (int i = 0; i < arr.length; i++) {
		sum2 = sum2 + arr[i];
	}
	//subract two sum values to get the missing number
	int sub = sum1-sum2;
	System.out.println("Missing number: " + sub);
	
	
	//method2
	int[] array = {4,6,1,2,5,7}; //output is 3
	Arrays.sort(array); //sort to ascending order
	for (int i = 0; i < array.length; i++) {
		//if the number in index is not equal to its next index, then the next index must be the missing number
		if(array[i]!=i+1) {
			int result = i+1;
			System.out.println("Missing number: " + result);
			//once we get the condition right, break out of the loop
			break;
		}
	}
}
}
