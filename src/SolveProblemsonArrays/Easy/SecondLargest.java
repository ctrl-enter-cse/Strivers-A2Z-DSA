package SolveProblemsonArrays.Easy;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 6, 7 ,7};
//			{ 2, 5, 1, 3, 0 };

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
		System.out.println("secondmax approch 1: " + secondmax);
		
		
//		from end to first
//		after sort this is valid 
		
		for( int i=arr.length-1;i>0;i--) {
			if(max!=arr[i]) {
				secondmax=arr[i];
				break;
			}
		}
		System.out.println("second max approch 2: "+secondmax);
		
		
//		aproch 3 better 
		max=0;
		 for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
			 }
		 }
		 secondmax=0;
		 for(int i=0;i<arr.length;i++) {
			 if(max>arr[i] &&secondmax<arr[i] ) {
				 secondmax=arr[i];
			 }
		 }
		 System.out.println(secondmax);
	}
}

//op:
//max:5
//
//secondmax approch 1: 3
//second max approch 2: 3
