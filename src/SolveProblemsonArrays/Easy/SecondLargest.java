package SolveProblemsonArrays.Easy;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 1, 3, 0 };

		Arrays.sort(arr);

		int max = arr[arr.length - 1];
		System.out.println("max:" + max);
		int secondmax = 0;

		// till the second last as last(max) we know no need to check the number
		for (int i = 0; i < arr.length - 1; i++) {
			if (max > arr[i] && secondmax < arr[i]) {
				secondmax = arr[i];
			}
		}
		System.out.println();
		System.out.println("secondmax:" + secondmax);

	}

}
