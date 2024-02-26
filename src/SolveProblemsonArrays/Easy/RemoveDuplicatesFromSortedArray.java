package SolveProblemsonArrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 3, 4};
		
		
		System.out.println("orignal: arr1 = { 1, 2, 2, 3, 3, 4}");
		System.out.println("bruteForce using Set removeing duplicate");
		Set arr=removeDuplcate(arr1);
		System.out.println("size:"+arr.size());
		System.out.println("result:"+arr);
		
		
	}

	
//	bruteForce using  Set
	private static Set removeDuplcate(int[] arr1) {
		Set st=new HashSet();
		for(int i=0;i<arr1.length;i++) {
			st.add(arr1[i]);
		}
		
		int i=0;
		for(int j=1;j<arr1.length;j++) {
			if(arr1[i]!=arr1[j]) {
				i++;
				arr1[i]=arr1[j];
			}
		}
//				as i start from 0 so i+1 is the size
		System.out.println(i+1);
		System.out.println("------- print only this the index +1 from the orignal arr1" );
		for(int k=0;k<i+1;k++) {
			System.out.println(arr1[k]);
		}

		System.out.println("-------");
		return st;
	}
}
