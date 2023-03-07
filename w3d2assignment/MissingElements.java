package week3.day2.w3d2assignment;

import java.util.Arrays;

public class MissingElements{
	public static void main(String[] args) {
		//method 1
		
		int[] array = {2,4,1,3,6,7};
		//sort the array to ascending order
		Arrays.sort(array);
		//if you want to print, you can. But not mandatory.
		System.out.println("Array in ascending order: " + Arrays.toString(array));
		//open a for loop to iterate over each elements
		for (int i = 0; i < array.length; i++) {
			//checks if the element is in the correct index. Ex: array[0]!=0+1 i.e., 1!=1
			if(array[i]!=i+1) {
				int missing = i+1;
				System.out.println("Missing element is: " + missing);
				break;
			}
		}
		
		
		//method 2
		
		int[] arr = {3,1,4,8,6,7,5};
		Arrays.sort(arr);
		System.out.println("Array in ascending order: " + Arrays.toString(arr));
		int sum1 = 0;
		for (int i = arr[0]; i < arr[arr.length-1]; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("Sum1: " + sum1);
		
		int sum2 = 0;
		for (int i = 0; i < arr.length-1; i++) {
			sum2 = sum2 + arr[i];
		}
		System.out.println("Sum2: " + sum2);
		
		int missing = sum1 - sum2;
		System.out.println("Missing element is: " + missing);
	}
}

