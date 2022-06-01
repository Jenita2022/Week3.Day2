package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
int count;
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		List<Integer> list1 = new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++)
			list1.add(arr[i]);
		System.out.println(list1);

		for (int i=0;i<list1.size();i++) {
			count=0;
			for (int j=i+1;j<list1.size();j++) {
				if (list1.get(i)==list1.get(j)) {
					count = count+1;
				}
			}
			if(count>0)
			System.out.println(list1.get(i));
		}





	}

}
