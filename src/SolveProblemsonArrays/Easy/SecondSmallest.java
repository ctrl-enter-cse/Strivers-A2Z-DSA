package SolveProblemsonArrays.Easy;

import java.util.Arrays;

public class SecondSmallest {
	public static int ssmaller(int n, int[] a) {
		int smaller = a[0];
		int ssecondsmaller = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] < smaller) {
				ssecondsmaller = smaller;
				smaller = a[i];
				
			} else if (a[i] <= ssecondsmaller && a[i] > smaller) {
				
				ssecondsmaller = a[i];
			}
		}
		return ssecondsmaller;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 3, 6, 7 ,7};
//			{2,5,1,3,0};
//			Arrays.sort(arr);

//			int small=arr[0];
		int x = ssmaller(5, arr);
		System.out.println(x);
	}

}
