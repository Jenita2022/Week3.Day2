package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		//split the text and store it in string array
		String[] splitArr = text.split(" ");

		//print array after split
		for(int i=0;i<splitArr.length;i++) 
			System.out.println(splitArr[i]);

		//create Set to remove duplicates 
		Set<String> remDupArr = new LinkedHashSet<String>();

		//adding words to set
		for(int i=0;i<splitArr.length;i++) 
			remDupArr.add(splitArr[i]);

		//print after adding set string
		System.out.println("set " +remDupArr);

		//print words removing duplicates
		for (String words : remDupArr) {
			System.out.print(" " +words);
		}
	}

}

/*
 * Pseudo code 

 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 

 * g) Displaying the String without duplicate words	
 */