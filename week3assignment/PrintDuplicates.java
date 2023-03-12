package week3assignment;

public class PrintDuplicates {
public static void main(String[] args) {
	//method1
	int[] arr = {11,55,77,66,11,77,33}; //output must be 11 77
	//need to compare each number with rest other numbers
	//will use nested for loop here
	for (int i = 0; i < arr.length; i++) {
		//declare a temp variable
		int count = 0;
		for (int j = i+1; j < arr.length; j++) {
			//if number in i matches the number in j increase the count by 1
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		//if the count is more than 0, it is a duplicate number
		if(count>0) {
			System.out.println(arr[i]);
		}
	}
	
	
	//in above program numbers 11 and 77 are present 2 times
	//if the number is present more than 2 times, we need to add some more conditions
	
	int[] arr1 = {2,33,11,85,33,85,6,2,85,2}; //here 2,85,33 are duplicates but 2 and 85 are more than 2 times
	for (int m = 0; m < arr1.length; m++) {
		int count1=0;
		for (int n = m+1; n < arr1.length; n++) {
			if(arr1[m]==arr1[n]) {
				count1++;
				//change the number in the index to 1000
				arr1[n]=1000;
			}
		}
		//print the numbers for which the count is more than 0 and not equal to 1000
		if(count1>0 && arr1[m]!=1000) {
			System.out.println(arr1[m]);
		}
	}
}
}
