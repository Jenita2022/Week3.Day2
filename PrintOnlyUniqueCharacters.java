package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babu";
		char[] chArr = input.toCharArray(); 

		Set<Character> set1 = new HashSet<Character>();

		for(int i=0;i<chArr.length;i++) {
			int count = 0;
			for(int j=0;j<chArr.length;j++) {
				if(chArr[i]==chArr[j]) {
					count=count+1;
				}
				if (count==0) {
					set1.add(chArr[i]);		
				}
			}
		}
		System.out.println("Unique Char:" +set1);

	}
}
