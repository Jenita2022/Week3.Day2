package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args){		
		//1. Array creation and printing array values
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		Arrays.sort(numbers);
		System.out.println("Array Values");
		for (int i=0;i<numbers.length;i++) 
			System.out.print(" " +numbers[i]); //output  1 2 2 3 4 6 6 7 8 8 9 10

		//2. creating set using TreeSet to add in ascending order by removing duplicates
		Set<Integer> set1 = new TreeSet<Integer>();
		for (int i=0;i<numbers.length;i++) {
			set1.add(numbers[i]);
		}
		System.out.println(" " +"Set Values " +set1); // output [1, 2, 3, 4, 6, 7, 8, 9, 10]

		//3. Create List and parameterize it by passing set values.
		List<Integer> lis = new ArrayList<Integer>(set1);
		
		//4. Finding missing number in list
		for(int i=0;i<lis.size();i++) {
			if (lis.get(i)!=i+1) {
				System.out.println("Missing No. in List " +(i+1));
				break;
			}
		}
	}
}



















/* 1) Remove the duplicates using Set
 * 2) Make sure the set is in the ascending order
 * 3) Iterate from the starting number and verify the next number is + 1
 * 4) If did not match, that is the number*/