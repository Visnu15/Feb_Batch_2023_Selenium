package week3.day2.week3day2assignment;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	String noDuplicates = "";
	for (int i = 0; i < split.length; i++) {
		int count = 0;
		for (int j = i+1; j < split.length; j++) {
			String nill = "";
			if(split[i].equals(split[j])) {
				count++;
				split[j] = nill;
			}
		}
		if(count==0 && split[i]!="nill") {
			noDuplicates = noDuplicates + split[i] + " ";
		}
	}
	System.out.println("Original text: " + text);
	System.out.println("Duplicates removed: " + noDuplicates);
}
}
