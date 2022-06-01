package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		//Arrays.sort(arr);

		List<Integer> lis = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			lis.add(arr[i]);
		}
		Collections.sort(lis);
		System.out.println("Print List " +lis);

		//find missing element in list -iterator variable is not equal to the array values

		for(int i=0;i<lis.size();i++) {
			if(lis.get(i)!=i+1) {
				System.out.println("Missing Element " +(i+1));
				break;
			}
		}

	}
}
/*Ite	i getValue		
	0	1	1		
	1	2	2		
	2	3	3		
	3	4	4		
	4	5	6	break;	get4
	5	6	7		
	6	7	8	*/	
