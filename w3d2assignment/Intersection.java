package week3.day2.w3d2assignment;

public class Intersection {
public static void main(String[] args) {
	//to find common elements
	int[] arr1 = {3,2,1,6,4,5};
	int[] arr2 = {4,7,9,3,8,2};
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
			}
		}
		
	}
}
}
