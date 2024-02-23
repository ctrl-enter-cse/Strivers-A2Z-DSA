package SolveProblemsonArrays.Easy;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 3, 0 };
		// brute
		Arrays.sort(arr);
		System.out.println(" Approch 1 max" + arr[arr.length - 1]);
//-----------------------------------------------------------------------------------------------
		int arr1[] = { 2, 5, 1, 3, 0 };
//		optimal
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println(" Approch 2 max" + max);
	}

}
