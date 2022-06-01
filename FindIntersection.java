package week3.day2;

import java.util.List;
import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;

		//Create list for both int arrays
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		//Add array of items into list
		for (int i=0;i<arr1Len;i++) {
			list1.add(arr1[i]);
		}
		System.out.println(list1);

		for (int j=0;j<arr2Len;j++) {
			list2.add(arr2[j]);
		}
		System.out.println(list2);

		//Compare both lists and print intersection items
		for (int i=0;i<arr1Len;i++) {
			for (int j=0;j<arr2Len;j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("Intersection Items from both Array list: " +list1.get(i));
									}	
			}
		}

	}


}


