package week3assignment;

public class RemoveDuplicates {
public static void main(String[] args) {
	String txt = "In this sentance there are this several duplicate this words";
	//going to remove all "this" from the above sentance
	//split it to words
	String[] split = txt.split(" ");
	//initialize for loop to compare the words with each other words
	for (int i = 0; i < split.length; i++) {
		//create a temp variable
		int count = 0;
		for (int j = i+1; j < split.length; j++) {
			//if the word in i is equal to the word in j increase the count by 1 and replace the word with ""
			if(split[i].equals(split[j])) {
				count++;
				split[j] = "nill";
			}
		}
		//if the count is 0 and word i is not equal, the word is unique
		String unique = "";
		if(count==0 && split[i]!="nill") {
			unique = unique + split[i];
			System.out.print(unique + " ");
		}
	}
}
}
